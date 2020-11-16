
import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    
    private List<T> pipe;

    public Pipe() {
        pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        pipe.add(value);
    }
    
    public T takeFromPipe() {
        if (pipe.isEmpty()) {
            return null;
        }
        T longestInPipe = pipe.get(0);
        pipe.remove(0);
        return longestInPipe;
    }
    
    public boolean isInPipe() {
        return pipe.size() > 0;
    }
    
}

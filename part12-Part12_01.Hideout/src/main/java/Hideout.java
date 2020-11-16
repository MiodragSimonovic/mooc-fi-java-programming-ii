
public class Hideout<T> {
    
    private T hidden;
    
    public void putIntoHideout(T toHide) {
        hidden = toHide;        
    }
    
    public T takeFromHideout() {
        T removed = hidden;
        hidden = null;
        return removed;
    }
    
    public boolean isInHideout() {
        return hidden != null;
    }
    
}

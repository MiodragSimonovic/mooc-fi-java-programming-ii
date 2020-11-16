
import java.util.ArrayList;

public class Herd implements Movable {
    
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public String toString() {
        String movableString = "";
        for (Movable movable: herd) {
            movableString += movable.toString() + "\n";
        }
        return movableString;
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable movable: herd) {
            movable.move(dx, dy);
        }
    }
    
}


import java.util.ArrayList;

public class Box  implements Packable {
    
    private double maximumCapacity;
    private ArrayList<Packable> items;

    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public double weight() {
        double boxWeight = 0;
        for (Packable item: items) {
            boxWeight += item.weight();
        }
        return boxWeight;
    }
    
    public void add(Packable item) {
        if (weight() + item.weight() <= maximumCapacity) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
    
}

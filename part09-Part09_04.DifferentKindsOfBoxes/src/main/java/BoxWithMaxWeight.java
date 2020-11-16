
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public int weight(ArrayList<Item> items) {
        int boxWeight = 0;
        for (Item item: items) {
            boxWeight += item.getWeight();
        }
        return boxWeight;
    }
    
    @Override
    public void add(Item item) {
        if (weight(items) + item.getWeight() <= capacity) {
            items.add(item);            
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}

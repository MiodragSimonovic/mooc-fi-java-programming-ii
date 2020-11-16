
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private Map<String, Item> items;

    public ShoppingCart() {
        items = new HashMap<String, Item>();
    }
    
    public void add(String product, int price) {
        items.putIfAbsent(product, new Item(product, 0, price));
        items.get(product).increaseQuantity();
    }
    
    public int price() {
        int price = 0;        
        for (Item item: items.values()) {
            price += item.price();
        }
        return price;
    }
    
    public void print() {
        for (Item item: items.values()) {
            System.out.println(item);
        }
        
    }
    
}

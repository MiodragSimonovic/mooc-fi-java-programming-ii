
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stockBalance;    

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stockBalance.put(product, stock);
    }
    
    public int price(String product) {
        return prices.getOrDefault(product, -99);        
    }
    
    public int stock(String product) {
        return stockBalance.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (stock(product) > 0) {
            int take = stock(product) - 1;
            stockBalance.put(product, take);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return prices.keySet();
    }
    
}


public class Item {
    
    private String productName;    
    private int productsInItem;
    private int unitPrice;
    
    public Item(String productName, int qty, int unitPrice) {
        this.productName = productName;
        this.productsInItem = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return unitPrice * productsInItem;
    }
    
    public void increaseQuantity() {
        productsInItem++;
    }
    
    public String toString() {
        return productName + ": " + productsInItem;
    }
    
}

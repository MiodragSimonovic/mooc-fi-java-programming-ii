
public class Container {
    
    private int liquid;
    
    public int contains() {
        return liquid;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            liquid = liquid;
        } else if (liquid + amount > 100) {           
            liquid = 100;
        } else {
            liquid += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            liquid = liquid;
        } else if (liquid < amount) {
            liquid = 0;
        } else {
            liquid -= amount;
        }
    }

    @Override
    public String toString() {
        return liquid + "/100";
    }
    
}


import java.util.HashMap;

public class IOU {
    
    private HashMap<String, Double> myCreditors;

    public IOU() {
        myCreditors = new HashMap<>();
    }    
    
    public void setSum(String toWhom, double amount) {
        myCreditors.put(sanitizedString(toWhom), amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
         return myCreditors.getOrDefault(sanitizedString(toWhom), 0.0);
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
    
}

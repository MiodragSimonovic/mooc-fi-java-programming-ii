
import java.util.HashMap;


public class Program {

    public static void main(String[] args) {
        
        HashMap<String, String> hashMap = new HashMap<>();
        
        hashMap.put("Jedan", "One");
        hashMap.put("Dva", "Two");
        
        printKeys(hashMap);
        printKeysWhere(hashMap, "Jedan");
        
    } 
    
 
    
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

}

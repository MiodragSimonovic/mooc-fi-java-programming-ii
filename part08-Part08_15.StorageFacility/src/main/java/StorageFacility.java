
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        ArrayList<String> unit = storage.get(storageUnit);
        unit.remove(item);
        if (unit.isEmpty()) {
            storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String unit: storage.keySet()) {
            storageUnits.add(unit);
        }
        return storageUnits;
    }
    
}


import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        vehicleRegistry = new HashMap<>();
    }
    
    public boolean search(LicensePlate licensePlate) {
        return vehicleRegistry.containsKey(licensePlate);
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!search(licensePlate)) {
            vehicleRegistry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return vehicleRegistry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (search(licensePlate)) {
            vehicleRegistry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate: vehicleRegistry.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> vehicleRegistryOwners = new ArrayList<>();    
        for (String owner: vehicleRegistry.values()) {
            if (!(vehicleRegistryOwners.contains(owner))) {
                System.out.println(owner);
                vehicleRegistryOwners.add(owner);
            }
        }
    }
    
}

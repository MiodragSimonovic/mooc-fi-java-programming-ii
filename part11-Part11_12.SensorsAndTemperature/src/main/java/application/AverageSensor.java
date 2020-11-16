package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> averegeReadings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        averegeReadings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }    

    @Override
    public boolean isOn() {
        int count = 0;        
        for (Sensor sensor: sensors) {
            if (sensor.isOn()) {
                count++;
            }
        }
        return count == sensors.size();
    }

    @Override
    public void setOn() {
        for (Sensor sensor: sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor: sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Average sensor is off, it needs to be on.");
        }
        if (sensors.size() == 0) {
            throw new IllegalStateException("No sensor is added to Average sensor, you need to add at least one.");
        }
        double averageDouble = sensors.stream().mapToInt(Sensor::read).average().getAsDouble();
        int averageInt = (int) Math.round(averageDouble);
        averegeReadings.add(averageInt);
        return averageInt;
    }
    
    public List<Integer> readings() {
        return averegeReadings;
    }
    
}

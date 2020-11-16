package application;

public class StandardSensor implements Sensor {
    
    private int temperature;

    public StandardSensor(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean isOn() {
        return true;
    }
    
    @Override
    public int read() {
        return temperature;
    }

    @Override
    public void setOn() {
        read();
    }

    @Override
    public void setOff() {
        read();
    }
    
}

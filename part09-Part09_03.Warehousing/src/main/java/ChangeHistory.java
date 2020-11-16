
import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double maxValue = history.get(0);
        for (double value: history) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    
    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double minValue = history.get(0);
        for (double value: history) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
    
    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double value: history) {
            sum += value;
        }
        return  sum / history.size();
    }
    
}

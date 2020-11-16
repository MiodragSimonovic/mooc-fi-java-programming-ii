
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        
        ArrayList<Integer> inputs = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(Integer.valueOf(input));
        }
        
        scanner.close();
        
        double average = inputs.stream().mapToInt(i -> i).average().getAsDouble();
        System.out.println("average of the numbers: " + average);

    }
    
}

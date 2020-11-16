
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        
        int sum = 0;
        int count = 0;
        
        Scanner scanner = new Scanner(System.in);        
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum += number;
                count++;
            }
        }
        
        scanner.close();
        
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / count;
            System.out.println(average);
        }        

    }
    
}

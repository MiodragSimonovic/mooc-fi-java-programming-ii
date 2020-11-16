
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }
        
        scanner.close();
        
        numbers.stream().filter(number -> number >= 1 && number <= 5).forEach(number -> System.out.println(number));

    }
    
}

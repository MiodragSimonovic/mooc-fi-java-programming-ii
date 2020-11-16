
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        String input;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }
        
        double averageOfPositive = numbers.stream().mapToInt(i -> i).filter(j -> j > 0).average().getAsDouble();
        double averageOfNegative = numbers.stream().mapToInt(i -> i).filter(j -> j < 0).average().getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        input = scanner.nextLine();
        
        switch (input) {
            case "p":
                System.out.print("Average of the positive numbers: " + averageOfPositive);
                break;
            case "n":
                System.out.print("Average of the negative numbers: " + averageOfNegative);
                break;
            default:
                System.out.println("Error! You should enter n or p!");
                break;
        }
        
        scanner.close();

    }
    
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        
        String input;
        ArrayList<Integer> numbers = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }
        
        scanner.close();
        
        System.out.println(positive(numbers));

    }
    
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(i -> i > 0).collect(Collectors.toList());
    }

}

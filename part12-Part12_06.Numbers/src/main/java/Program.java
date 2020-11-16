
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        int input = 0;
        
        System.out.println("How many random numbers should be printed?");
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            input = Integer.valueOf(scanner.nextLine());
            if (input <= 0) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e){
            System.out.println("Error. Input needs to be integer number bigger then 0(zero)");
        }
        
        scanner.close();
        
        for (int i = 0; i < input; i++) {
            int randomNumber = new Random().nextInt(11);
            System.out.println(randomNumber);
        }
        
    }

}

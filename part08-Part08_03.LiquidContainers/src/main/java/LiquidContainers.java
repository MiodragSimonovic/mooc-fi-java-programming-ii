
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        
        int firstContainerLiquid = 0;
        int secondContainerLiquid = 0;
        
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + firstContainerLiquid + "/100" + "\n" + 
                               "Second: " + secondContainerLiquid + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int liquid = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (liquid < 0) {
                    firstContainerLiquid = firstContainerLiquid;
                } else if (firstContainerLiquid + liquid <= 100) {
                    firstContainerLiquid += liquid;
                } else {
                    firstContainerLiquid = 100;
                }
            }
            if (command.equals("move")) {
                if (liquid < 0) {
                    firstContainerLiquid = firstContainerLiquid;
                } else if (firstContainerLiquid - liquid >= 0) {
                    firstContainerLiquid -= liquid;
                    if (secondContainerLiquid + liquid <= 100) {
                        secondContainerLiquid += liquid;
                    } else {
                        secondContainerLiquid = 100;                      
                    }                    
                } else {
                    secondContainerLiquid += firstContainerLiquid;
                    firstContainerLiquid = 0;                    
                }
            }
            if (command.equals("remove")) {
                if (liquid < 0) {
                    secondContainerLiquid = secondContainerLiquid;
                } else if (secondContainerLiquid - liquid >= 0) {
                    secondContainerLiquid -= liquid;
                } else {
                    secondContainerLiquid = 0;
                }
            }            

        }
        
        scan.close();
        
    }

}

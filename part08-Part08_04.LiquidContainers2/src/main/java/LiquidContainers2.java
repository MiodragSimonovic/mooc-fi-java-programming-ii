
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        
        Container container1 = new Container();
        Container container2 = new Container();
        
        
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + container1 + "\n" + 
                               "Second: " + container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int liquid = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                container1.add(liquid);
            }
            if (command.equals("move")) {                
                if (liquid > container1.contains()) {
                    container2.add(container1.contains());
                } else {
                    container2.add(liquid);
                }
                container1.remove(liquid);
            }
            if (command.equals("remove")) {
                container2.remove(liquid);
            }            

        }
        
        scan.close();
        
    }

}

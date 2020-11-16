package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        
        System.out.print("Enter title of the program: ");
        
        Scanner scanner = new Scanner(System.in);
        
        String title = scanner.nextLine();
        
        scanner.close();
        
        Application.launch(UserTitle.class, "--title=" + title);
        
    }

}

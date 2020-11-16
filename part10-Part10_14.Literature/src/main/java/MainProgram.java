
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        List<Book> books = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, ageRecommendation));
            System.out.println("");            
        }
        
        scanner.close();
        
        books.sort(Comparator.comparing(Book::getAgeRecommendation).thenComparing(Book::getName));
        
        System.out.println("\n" + books.size() + " books in total.\n");
        
        System.out.println("Books:");
        for (Book book: books) {
            System.out.println(book);
        }

    }

}

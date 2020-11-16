
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {
    
    public static void main(String[] args) {
        
        // test your method here

    }
    
    
    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        try {
            // reading the file line by line
            Files.lines(Paths.get(file))
                // splitting the row into parts on the "," character
                .map(row -> row.split(","))
                // deleting the split rows that have less than 4 parts (we want the rows to always contain name,publishing year,page count,author)
                .filter(parts -> parts.length >= 4)
                // creating books from the parts
                .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                // and finally add the books to the list
                .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }

}

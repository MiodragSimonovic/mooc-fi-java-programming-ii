
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        List<Literacy> list = readFile("literacy.csv");        
        list.sort(Comparator.comparing(Literacy::getLiteracyPercent));
        printFile(list);

    }
    
    
    public static List<Literacy> readFile(String fileName) {
        List<Literacy> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(fileName)).map(row -> row.split(",")).filter(parts -> parts.length >= 6)
                    .map(parts -> new Literacy(parts[3].trim(), Integer.valueOf(parts[4]), parts[2].substring(0, parts[2].length() - 4).trim(), Double.valueOf(parts[5])))
                    .forEach(literacy -> list.add(literacy));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }
    
    public static void printFile(List<Literacy> list) {
        list.stream().forEach(i -> System.out.println(i));
    }  
    
}

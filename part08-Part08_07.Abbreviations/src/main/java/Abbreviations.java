
import java.util.HashMap;

public class Abbreviations {
    
    HashMap<String, String> abbreviations;

    public Abbreviations() {
        abbreviations = new HashMap<>();
    }
    
    public static String sanitizedString(String string) {
    if (string == null) {
        return "";
    }
    string = string.toLowerCase();
    return string.trim();
}
    
    public void addAbbreviation(String abbreviation, String explanation) {        
        abbreviations.put(sanitizedString(abbreviation), sanitizedString(explanation));
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(sanitizedString(abbreviation));
    }
    
    public String findExplanationFor(String abbreviation) {
         return abbreviations.get(sanitizedString(abbreviation));
    }   
    
}

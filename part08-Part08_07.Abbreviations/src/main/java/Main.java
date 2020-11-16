
public class Main {

    public static void main(String[] args) {
        
        Abbreviations abbreviations = new Abbreviations();
        
        abbreviations.addAbbreviation("NPR", "NAPRIMER");
        abbreviations.addAbbreviation(" itd", "I Tako Dalje");
        
        System.out.println(abbreviations.hasAbbreviation("npr"));
        
        System.out.println(abbreviations.findExplanationFor("ITD"));
        
    }
    
}


public class CD implements Packable {
    
    private String artist;
    private String nameOfTheCD;
    private int publicationYear;
    private double weight;

    public CD(String artist, String nameOfTheCD, int publicationYear) {
        this.artist = artist;
        this.nameOfTheCD = nameOfTheCD;
        this.publicationYear = publicationYear;
        weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artist + ": " + nameOfTheCD + " (" + publicationYear + ")";
    }
    
}

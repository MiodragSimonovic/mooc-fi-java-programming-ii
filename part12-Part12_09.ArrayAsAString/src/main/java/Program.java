
public class Program {

    public static void main(String[] args) {
        
        
        
    }
    
    
    public static String arrayAsString(int[][] array) {
        StringBuilder arrayAsString = new StringBuilder();        
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                arrayAsString.append(value);
            }
            arrayAsString.append("\n");
        }
        return arrayAsString.toString();
    }

}

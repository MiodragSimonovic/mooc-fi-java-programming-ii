
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        
        if (size % 2 == 0) {
            throw new RuntimeException("Error, size must be odd");
        }

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here:
        
        int x = (size - 1) / 2;
        int y = 0;
        square.placeValue(x, y, 1);
        for (int i = 2; i <= size * size; i++) {
            int[] newPosition = nextPosition(square, x, y);
            x = newPosition[0];
            y = newPosition[1];
            square.placeValue(x, y, i);
        }        
        return square;
    }
    
    private int[] nextPosition(MagicSquare square, int x, int y) {
        int nextY = (y - 1 + square.getHeight()) % square.getHeight();
        int nextX = (x + 1) % square.getWidth();
        if (square.readValue(nextX, nextY) == 0) {
            return new int[] {nextX, nextY};
        } else {
            y = (y + 1) % square.getWidth();
            return new int[] {x, y};
        }
    }

}

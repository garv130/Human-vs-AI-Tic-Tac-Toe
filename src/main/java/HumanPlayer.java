import java.util.Scanner;

public class humanplayer implements player{
    private char symbol;
    private Scanner input;

    public humanplayer(char symbol) {
        this.symbol = symbol;
        this.input = new Scanner(System.in);
    }

    public char getSymbol() {
        return symbol;
    }

    public void makeMove(board board) {
        boolean success = false;
        while (!success){
            System.out.println("Player " + symbol + ", enter your move (row and column 0–2):");
            success = board.spotMarker(row, col, symbol);
            if (!success){
                System.out.println("Invalid move. Please try again.");
            }
        
        }

    }

}

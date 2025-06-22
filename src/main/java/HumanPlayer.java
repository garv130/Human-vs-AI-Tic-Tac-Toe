import java.util.Scanner;

public class HumanPlayer implements Player{
    private char symbol;
    private Scanner input;

    public HumanPlayer(char symbol) {
        this.symbol = symbol;
        this.input = new Scanner(System.in);
    }

    public char getSymbol() {
        return symbol;
    }

    public void makeMove(Board board) {
        boolean success = false;
        while (!success){
            System.out.println("Player " + symbol + ", enter your move (row and column, enter the row first (0-2) press enter then the column (0-2)):");
            int row = input.nextInt(); 
            int col = input.nextInt();
            success = board.spotMarker(row, col, symbol);
            if (!success){
                System.out.println("Invalid move. Please try again.");
            }
        }

    }


}

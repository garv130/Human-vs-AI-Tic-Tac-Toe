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

}

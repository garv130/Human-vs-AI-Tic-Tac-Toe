import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        System.out.print("Do you want to be X or O? (X goes first): ");
        char symbol = scanner.nextLine().trim().toUpperCase().charAt(0);
    
        while (symbol != 'X' && symbol != 'O') {
            System.out.print("Invalid input. Please enter X or O: ");
            symbol = scanner.nextLine().trim().toUpperCase().charAt(0);
        }
    }
}

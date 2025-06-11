import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Random rand = new Random();

        System.out.print("Do you want to be X or O? (X goes first): ");
        char symbol = scanner.nextLine().trim().toUpperCase().charAt(0);

        while (symbol != 'X' && symbol != 'O') {
            System.out.print("Invalid input. Please enter X or O: ");
            symbol = scanner.nextLine().trim().toUpperCase().charAt(0);
        }

        char aiSymbol;
        if (symbol == 'X') {
            aiSymbol = 'O';
        } else {
            aiSymbol = 'X';
        }

        System.out.println("You are " + symbol + ". AI is " + aiSymbol + ".");
        
        //Guessing number system to decide who goes first
        int correctNumber = rand.nextInt(2) + 1;

        System.out.print("Guess a number (1 or 2) to decide who goes first: ");
        int guess = scanner.nextInt();
    }
}

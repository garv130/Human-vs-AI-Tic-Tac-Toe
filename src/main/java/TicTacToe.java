import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Random rand = new Random();

        System.out.print("Do you want to be X or O? ");
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
        
        int correctNumber = rand.nextInt(2) + 1;
        int guess = -1;
        while (true){
            System.out.print("Guess a number (1 or 2) to decide who goes first: ");

            try{
                guess = scanner.nextInt();
                if (guess == 1 || guess ==  2){
                    break; //Since its one of the 2 correct options exit the loop
                }
                else{
                    System.out.println("Invalid Guess! Please try again: ");
                }
            }

            catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number (1 or 2).");
        scanner.nextLine();

        }
    }

        boolean playerGoesFirst;
        if (guess == correctNumber) {
            System.out.println("You guessed right! You go first.");
            playerGoesFirst = true;
        } else {
            System.out.println("AI goes first.");
            playerGoesFirst = false;
        }



        
        Player human = new HumanPlayer(symbol);
        Player ai = new AIPlayer (aiSymbol);

        
        Player currentPlayer = null;
        if (playerGoesFirst) {
            currentPlayer = human;
        } else {
            currentPlayer = ai;
        }

        board.printBoard();

        boolean gameOver = false;

        while (!gameOver) {
            currentPlayer.makeMove(board);
            board.printBoard();

            if (board.checkWin(currentPlayer.getSymbol())) {
                System.out.println(" Player " + currentPlayer.getSymbol() + " wins!");
                gameOver = true;
            }
            else if (board.isFull()) {
                System.out.println("It's a draw!");
                gameOver = true;
            }
            else {
                if (currentPlayer == human) {
                    currentPlayer = ai;
                } 
                else {
                    currentPlayer = human;
                }
            }
        }
    }
}


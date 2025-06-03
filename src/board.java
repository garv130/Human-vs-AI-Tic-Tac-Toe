public class board {
    private char[][] board;
    private final int size = 3;

    public board() {
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public void printBoard(){
        // Loop through each row
          for (int i = 0; i < size; i++){
            System.out.print("| ");
         // Loop through each column in the current row
            for (int j = 0; j < size; j++){
                System.out.print(board[i][j] + " | ");
            }
            // To get to new line 
            System.out.println();
          }
        } 
}

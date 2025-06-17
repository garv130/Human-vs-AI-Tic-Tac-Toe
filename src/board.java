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
    
    public boolean spotMarker(int row, int col, char symbol){
        //Make sure the row and column are valid 
        if (row >= 0 && row < size && col >=0 && col < size){
            //Check if the spot is open
            if(board[row][col] == ' '){
            // If yes then put the symbol there
                board[row][col] = symbol;
                return true;
            } 
        }
         //Otherwise false is returned
         return false;
        }

    public boolean checkWin(char symbol){
            //Check if there is a winner in a row
        for (int i = 0; i < size; i++){
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol){
                return true;
            }
           }
        for (int i = 0; i < size; i++){
            //Check the columns
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol){
                return true;
            }
           }
    // Check the diagonal for winners
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol){
            return true;
        }
        

        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol){
            return true;
        }

        return false;
    }   

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == ' ') {
                    return false; 
                }
            }
        }
        return true;
    }

    // Needed for the AI Player
    public char[][] getBoard() {
    return board;
}
 }

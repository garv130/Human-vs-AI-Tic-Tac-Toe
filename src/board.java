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
        if (row >= 0 && row < size && col >=0 && col > size){
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

     //public boolean checkWin(char symbol){
        // Check if they win first with rows, then columns, then diagonal
    //}    
 }

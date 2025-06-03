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
}

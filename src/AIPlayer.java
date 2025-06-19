public class AIPlayer implements Player {
    private char symbol;

    public AIPlayer(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void makeMove(Board board) {

        try{
            String prompt = "You are playing as " + symbol + "and here is the current board";
        }
    }

    // Helper method so AI will be able to read what the current board is and make
    // its next move based on that
    private String getCurrentBoard(Board board) {
        String currentBoard = "";
        char[][] b = board.getBoard();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = b[i][j];
                if (c == ' ') {
                    currentBoard += "-";
                } 
                else {
                    currentBoard += c;
                }

                if (j < 2) {
                    currentBoard += " ";
                }
            }
            currentBoard += "\n";
        }

        return currentBoard;
    }
}

public class ChatGPTPlayer implements Player {
    private static final String apiKey = "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";
    private static final String api_URL = "https://api.openai.com/v1/chat/completions";
    private char symbol;

    public ChatGPTPlayer(char symbol) {
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

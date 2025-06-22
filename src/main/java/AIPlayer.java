import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

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
            String prompt = "You are playing Tic Tac Toe as " + symbol + ".\n" +
                "Here is the current board:\n" + getCurrentBoard(board) +
                "Please respond ONLY with your next move in format: row,col (e.g. 1,2).\n" +
                "The top-left cell is row 0, column 0." +
                "Only respond with two numbers separated by a comma, with no extra words or explanation.\n" +
                "Example response: 1,2\n" +
                "The first number is the row. The second number is the column." +
                "Don't be too hard but also don't be easy if there is a chance to win take it";

            Client client = new Client();

            GenerateContentResponse response = client.models.generateContent("gemini-2.5-flash", prompt, null);


            String responseText = response.text();
            System.out.println("Ai response: " + responseText);
            
            //Splitting the respone in order for there to be no confusion with the code
            String[] parts = responseText.split(",");
            if (parts.length != 2) {
                System.out.println("Invalid response format from Ai.");
                return;
            }

            int row = Integer.parseInt(parts[0].trim());
            int col = Integer.parseInt(parts[1].trim());
            
            boolean success = board.spotMarker(row, col, symbol);
            if (!success) {
                System.out.println("Ai made an invalid move. Turn skipped.");
            }

        } 
            catch (Exception e) {
                System.out.println("AI failed to make a move: " + e.getMessage());
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

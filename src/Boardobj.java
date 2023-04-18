public class Boardobj {
    String[][] board = new String[3][3];

    public Boardobj(){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }

    }
}

import java.util.Scanner;
public class Game {
    String userO = "O";
    String userX = "X";
    String inp = "";
    int row = 0;
    int col = 0;
    public Game() {
        Scanner scan = new Scanner(System.in);
        Boardobj board = new Boardobj();
        System.out.println("Player 1 is X player 2 is O");
        for (int i = 0; i < 9; ) {
            if (i % 2 == 0) {
                System.out.println("Player 1 enter a row (0, 1, or 2): ");
                row = scan.nextInt();
                System.out.println("Player 1 enter a column (0, 1, or 2): ");
                col = scan.nextInt();
                inp = userX;
            }else {
                System.out.println("Player 2 enter a row (0, 1, or 2): ");
                row = scan.nextInt();
                System.out.println("Player 2 enter a column (0, 1, or 2): ");
                col = scan.nextInt();
                inp = userO;
            }
            if (board.board[row][col].equals(" ")) {
                board.board[row][col] = inp;
                i++;
            } else if (board.board[row][col].equals("X")) {
                System.out.println("spot taken");
                continue;
            } else if (board.board[row][col].equals("O")) {
                System.out.println("spot taken");
                continue;
            }
            System.out.println("-------------------");
            System.out.println("|  " + board.board[0][0] + "  |  " + board.board[0][1] + "  |  " + board.board[0][2] + "  |");
            System.out.println("-------------------");
            System.out.println("|  " + board.board[1][0] + "  |  " + board.board[1][1] + "  |  " + board.board[1][2] + "  |");
            System.out.println("-------------------");
            System.out.println("|  " + board.board[2][0] + "  |  " + board.board[2][1] + "  |  " + board.board[2][2] + "  |");
            System.out.println("-------------------");
            String winny = Win.win(board.board);
            if (winny.equals("X")){
                System.out.println("Player 1 has won! Thanks for playing!");
                System.exit(0);
            }else if (winny.equals("O")){
                System.out.println("Player 2 has won! Thanks for playing!");
                System.exit(0);
            }else if (winny.equals("notdoneyet")){
            }else if (winny.equals("draw")){
                System.out.println("This game has been a draw! Thanks for playing!");
                System.exit(0);
            }
        }
    }
}
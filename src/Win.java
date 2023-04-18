public class Win {
    String result;
    String win;
    Boardobj brd;
    public Win(String[][] board) {
        result="";
        for (int i=0; i<9; i++) {
            switch(i){
                case 0:
                    win = board[0][0]+board[0][1]+board[0][2];
                    break;
                case 1:
                    win = board[1][0]+board[1][1]+board[1][2];
                    break;
                case 2:
                    win = board[2][0]+board[2][1]+board[2][2];
                    break;
                case 3:
                    win = board[0][0]+board[1][0]+board[2][0];
                    break;
                case 4:
                    win = board[0][1]+board[1][1]+board[2][1];
                    break;
                case 5:
                    win = board[0][2]+board[1][2]+board[2][2];
                    break;
                case 6:
                    win = board[0][0]+board[1][1]+board[2][2];
                    break;
                case 7:
                    win = board[0][2]+board[1][1]+board[2][0];
                    break;
                case 8:
                    for (int n = 0; n < 3; n++) {
                        for (int j = 0; j < 3; j++) {
                            if (board[n][j].equals(" ")){
                                win="notdoneyet";
                            }
                        }
                    }
                    break;
            }
            if(win.equals("XXX")){
                result= "X";

            }else if(win.equals("OOO")){
                result= "O";

            }else if(win.equals("notdoneyet")){
                result= "notdoneyet";

            }else {
                result= "draw";
            }
        }
    }
}

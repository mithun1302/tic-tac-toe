import java.util.*;
public class tictactoe {
    public static void main(String[] args) {
        String[][] board = new String[3][3];
        Scanner sc = new Scanner(System.in);
        String player = "X";
        boolean flag = false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = "*";
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        int option =0;
        int count = board.length*board[0].length;
        while (option<count){

            System.out.println("Player "+ player);
            System.out.println("Choose Position:");
            int pos1 = sc.nextInt();
            int pos2 = sc.nextInt();

            if(board[pos1][pos2] == "*"){
                board[pos1][pos2] = player;
                count = count-1;
                flag = true;
            }
            else {
                System.out.println("Position Occupied");
                flag = false;
            }
            if(board[0][0]==player && board[0][1]==player && board[0][2]==player){
                System.out.println(player+" wins");
                break;
            } else if (board[0][0]==player && board[1][0]==player && board[2][0]==player) {
                System.out.println(player+" wins");
                break;
            } else if (board[1][0]==player && board[1][1]==player && board[1][2]==player) {
                System.out.println(player+" wins");
                break;
            } else if (board[2][0]==player && board[2][1]==player && board[2][2]==player) {
                System.out.println(player+" wins");
                break;
            } else if (board[0][1]==player && board[1][1]==player && board[2][1]==player) {
                System.out.println(player+" wins");
                break;
            } else if (board[0][2]==player && board[1][2]==player && board[2][2]==player) {
                System.out.println(player+" wins");
                break;
            } else if (board[0][0]==player && board[1][1]==player && board[2][2]==player) {
                System.out.println(player+" wins");
                break;
            } else if (board[0][2]==player && board[1][1]==player && board[2][0]==player) {
                System.out.println(player+" wins");
                break;
            }


            if(flag) {
                if (player == "X") {
                    player = "O";
                } else if (player == "O") {
                    player = "X";
                }
            }
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}

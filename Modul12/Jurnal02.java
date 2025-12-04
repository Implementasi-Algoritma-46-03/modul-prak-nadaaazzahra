import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];

        boolean adaKosong = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 0) {
                    adaKosong = true;
                }
            }
        }

      
        for (int i = 0; i < n; i++) {
            boolean sama = true;
            for (int j = 1; j < n; j++) {
                if (board[i][j] != board[i][0]) {
                    sama = false;
                    break;
                }
            }

            if (sama && board[i][0] == 1) { System.out.println("O"); return; }
            if (sama && board[i][0] == 2) { System.out.println("X"); return; }
        }

       
        for (int j = 0; j < n; j++) {
            boolean sama = true;
            for (int i = 1; i < n; i++) {
                if (board[i][j] != board[0][j]) {
                    sama = false;
                    break;
                }
            }

            if (sama && board[0][j] == 1) { System.out.println("O"); return; }
            if (sama && board[0][j] == 2) { System.out.println("X"); return; }
        }

   
        boolean sama = true;
        for (int i = 1; i < n; i++) {
            if (board[i][i] != board[0][0]) {
                sama = false;
                break;
            }
        }
        if (sama && board[0][0] == 1) { System.out.println("O"); return; }
        if (sama && board[0][0] == 2) { System.out.println("X"); return; }

        sama = true;
        for (int i = 1; i < n; i++) {
            if (board[i][n - 1 - i] != board[0][n - 1]) {
                sama = false;
                break;
            }
        }
        if (sama && board[0][n - 1] == 1) { System.out.println("O"); return; }
        if (sama && board[0][n - 1] == 2) { System.out.println("X"); return; }

       
        if (adaKosong) System.out.println("?");
        else System.out.println("-");
    }
}
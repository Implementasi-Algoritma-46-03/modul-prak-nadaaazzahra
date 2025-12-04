import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!sc.hasNextInt()) return;
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!sc.hasNextInt()) return;
                B[i][j] = sc.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = A[i][j] + B[i][j];
                sb.append(sum);
                if (j < n - 1) sb.append(" ");
            }
            if (i < n - 1) sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}

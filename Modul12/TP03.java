import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[][] A = new long[n][n];
        long[][] B = new long[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (sc.hasNextLong()) A[i][j] = sc.nextLong();
                else return;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (sc.hasNextLong()) B[i][j] = sc.nextLong();
                else return;

        long[][] C = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(C[i][j]);
                if (j < n - 1) sb.append(" ");
            }
            if (i < n - 1) sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}

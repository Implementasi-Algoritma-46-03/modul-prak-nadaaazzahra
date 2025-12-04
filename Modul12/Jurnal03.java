import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] spiral = new int[n][n];

        int angka = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (angka <= n * n) {

          
            for (int i = top; i <= bottom; i++) {
                spiral[i][left] = angka++;
            }
            left++;

        
            for (int j = left; j <= right; j++) {
                spiral[bottom][j] = angka++;
            }
            bottom--;

            
            for (int i = bottom; i >= top; i--) {
                spiral[i][right] = angka++;
            }
            right--;

            
            for (int j = right; j >= left; j--) {
                spiral[top][j] = angka++;
            }
            top++;
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            if (i < n - 1) System.out.println();
        }
    }
}

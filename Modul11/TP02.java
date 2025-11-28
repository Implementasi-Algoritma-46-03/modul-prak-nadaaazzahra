import java.util.Arrays;
import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        s.nextLine();
        
        int[] nilai = new int[n];

        for (int i = 0; i < n; i++){
            nilai[i] = s.nextInt();
        }

        Arrays.sort(nilai);

        for (int i = 0; i < n / 2; i++){
            int temp = nilai[i];
            nilai[i] = nilai[n - 1 - i];
            nilai[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++){
            System.out.print(nilai[i] + " ");
        }
    }
}
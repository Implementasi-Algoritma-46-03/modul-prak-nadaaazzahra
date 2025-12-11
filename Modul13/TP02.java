import java.util.Arrays;
import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        double[] gelombang1 = new double[10];
        double[] gelombang2 = new double[10];

        for (int i = 0; i < 10; i++) {
            gelombang1[i] = s.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            gelombang2[i] = s.nextDouble();
        }

        Arrays.sort(gelombang1);
        Arrays.sort(gelombang2);

        for (int i = 9; i >= 0; i--) {
            System.out.printf("%.2f", gelombang1[i]);
            if (i > 0) System.out.print(" ");
        }
        System.out.println();

        for (int i = 9; i >= 0; i--) {
            System.out.printf("%.2f", gelombang2[i]);
            if (i > 0) System.out.print(" ");
        }
    }
}
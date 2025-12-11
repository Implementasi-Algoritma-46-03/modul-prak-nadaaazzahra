import java.util.Arrays;
import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
              Scanner sc = new Scanner(System.in);

        double[] gelombang1 = new double[10];
        double[] gelombang2 = new double[10];

        for (int i = 0; i < 10; i++) {
            gelombang1[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            gelombang2[i] = sc.nextDouble();
        }

        Arrays.sort(gelombang1);
        Arrays.sort(gelombang2);

        for (int i = 0; i < gelombang1.length; i++) {
            System.out.printf("%.2f", gelombang1[i]);
        if (i < gelombang1.length - 1) System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < gelombang2.length; i++) {
            System.out.printf("%.2f", gelombang2[i]);
        if (i < gelombang2.length - 1) System.out.print(" ");
        }
    }
}

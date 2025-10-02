import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        int P = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();

        double NA = (0.25 * P) + (0.35 * A) + (0.40 * B);
        Boolean lulus = NA >= 75;
        System.out.printf(" : %.2f\n", NA);

        System.out.println("Lulus MK: " + lulus);
        
    }
}

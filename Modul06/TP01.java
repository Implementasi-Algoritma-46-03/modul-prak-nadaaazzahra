import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        double R1 = input.nextDouble();
        double R2 = input.nextDouble();
        double R3 = input.nextDouble();

        double C1 = (R1 - 32) * 5 / 9;
        double C2 = (R2 - 32) * 5 / 9;
        double C3 = (R3 - 32) * 5 / 9;

        double Re1 = (R1 - 32) * 4 / 9;
        double Re2 = (R2 - 32) * 4 / 9;
        double Re3 = (R3 - 32) * 4 / 9;
        
         System.out.printf("%.2f %.2f %.2f%n", C1, C2, C3);
        System.out.printf("%.2f %.2f %.2f%n", Re1, Re2, Re3);
    }
}

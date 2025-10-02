import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        double nilai1 = input.nextDouble();
        double nilai2 = input.nextDouble();
        double nilai3 = input.nextDouble();

        double nilaiRataRata = (nilai1 + nilai2 + nilai3) / 3.0;

        System.out.printf("Nilai rata-rata : %.2f", nilaiRataRata);


    }
}

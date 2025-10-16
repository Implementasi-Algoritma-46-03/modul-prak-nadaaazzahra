import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        //input
        int nilaiA = s.nextInt();
        int nilaiB = s.nextInt();
        int nilaiC = s.nextInt();

        //proses
        float nilaiRataRata = (nilaiA + nilaiB + nilaiC) / 3;

        //output
        System.out.print("Nilai rata-rata: ");
        System.out.printf("%.2f%n", nilaiRataRata);
    }
}

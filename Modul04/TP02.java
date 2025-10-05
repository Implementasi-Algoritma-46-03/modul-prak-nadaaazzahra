import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double total = N;
        double diskon = 0;

        if (N > 200000) {
            diskon = N * 0.05;
            total = N - diskon;
            System.out.println("Transaksi = " + N);
            System.out.println("Total = " + N + " - " + (int)diskon);
        } else {
            System.out.println("Transaksi = " + N);
            System.out.println("Total = " + N);
        }

        double ppn = total * 0.11;
        double totalDibayar = total + ppn;

        System.out.println("Ppn 11% = " + ppn);
        System.out.println("Total dibayar = " + totalDibayar);

        input.close();
    }
}
import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner input = new Scanner(System.in);
        
        double transaksi = input.nextDouble();
        double diskon = 0;

        if (transaksi > 200000) {
            diskon = transaksi * 0.05;
        }

        double total = transaksi - diskon;
        double pajak = total * 0.11;
        double totalBayar = total + pajak;
        
        int transaksiInt = (int) transaksi;
        int diskonInt = (int) diskon;

        System.out.println("Transaksi = " + transaksiInt);

        if (diskon > 0) {
            System.out.println("Total = " + transaksiInt + " - " + diskonInt);
        } else {
            System.out.println("Total = " + transaksiInt);
        }

        System.out.println("Ppn 11% = " + pajak);
        System.out.println("Total dibayar = " + totalBayar);
    }
}

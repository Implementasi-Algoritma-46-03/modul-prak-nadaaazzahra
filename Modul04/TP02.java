import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int diskon = 0;
        if (n > 200000) {
            diskon = n * 5 / 100;
        }

        float Total = n - diskon;
        float Ppn  = (Total * 0.11f);
        float TotalBayar = (Total + Ppn);

        System.out.println("Transaksi =" + " " + n);
        if (diskon > 0) {
            System.out.println("Total =" + " " + n + " " + "-" + " " + diskon);
        } else{
            System.out.println("Total =" + " " + n);
        }
        System.out.println("Ppn 11% =" + " " + Ppn);
        System.out.println("Total dibayar =" + " " + TotalBayar);
    }
}

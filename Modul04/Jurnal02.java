import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner (System.in);

        int n = s.nextInt();
        int newN = n * 1000000;
        int pajak1 = newN * 5 / 100;
        int pajak2 = newN * 15 /100;
        int pajak3 = newN * 25 / 100;
        int pajak4 = newN / 100 * 30;


        if (0 <= n && n <= 50 ) {
            System.out.println("Penghasilan kotor = " + n + " juta Rupiah");
            System.out.println("Pajak 5% = Rp. " + pajak1);
            System.out.println("Penghasilan bersih = Rp. " + (newN - pajak1));
        } else if (51 <= n && n <= 250) {
            System.out.println("Penghasilan kotor = " + n + " juta Rupiah");
            System.out.println("Pajak 15% = Rp. " + pajak2);
            System.out.println("Penghasilan bersih = Rp. " + (newN - pajak2));
        } else if (251 <= n && n <= 500) {
            System.out.println("Penghasilan kotor = " + n + " juta Rupiah");
            System.out.println("Pajak 25% = Rp. " + pajak3);
            System.out.println("Penghasilan bersih = Rp. " + (newN - pajak3));
        }else {
            System.out.println("Penghasilan kotor = " + n + " juta Rupiah");
            System.out.println("Pajak 30% = Rp. " + pajak4);
            System.out.println("Penghasilan bersih = Rp. " + (newN - pajak4));
        }
    }
}

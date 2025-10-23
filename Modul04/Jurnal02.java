import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini 
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double pajak = 0;

        if (n <= 50) 
        pajak = 0.05;
        else if (n >= 51 && n<=250)
        pajak = 0.15;
        else if (n >= 251 && n<=500)
        pajak = 0.25;
        else if (n>500)
        pajak = 0.30;

        int juta = n * 1000_000;
        double besarPajak = juta * pajak;
        double hasilBersih = juta - besarPajak;
        System.out.println("Penghasilan kotor = " + n + " juta Rupiah");
        System.out.println("Pajak " + (int)(pajak * 100) + "% = Rp. " + (int)besarPajak);
        System.out.println("Penghasilan bersih = Rp. " + (int)hasilBersih);

        

    }
}

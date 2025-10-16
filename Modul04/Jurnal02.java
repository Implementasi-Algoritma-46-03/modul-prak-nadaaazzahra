import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); 
        input.close();

        double persenPajak; 
        if (N <= 50) {
            persenPajak = 0.05;
        
        } else if (N <= 250) {
            persenPajak = 0.15;
        
        } else if (N <= 500) {
            persenPajak = 0.25;
       
        } else {
            persenPajak = 0.30;
        }

        double besarPajak = N * 1_000_000 * persenPajak;
        double penghasilanBersih = N * 1_000_000 - besarPajak;

        System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
        System.out.println("Pajak " + (int)(persenPajak * 100) + "% = Rp. " + (int)besarPajak);
        System.out.println("Penghasilan bersih = Rp. " + (int)penghasilanBersih);
    }
}

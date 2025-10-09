import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        if (N > 0 && N <= 50) {  
            System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
            N *= 1000000;
            int pajak = N * 5/100;
            int hasilBersih = N - pajak;
            System.out.println("Pajak 5% = Rp. " + pajak);
            System.out.println("Penghasilan bersih = Rp. " + hasilBersih );

        } else if (N >= 51 && N <= 250) {
            System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
            N *= 1000000;
            int pajak = N * 15/100;
            int hasilBersih = N - pajak;
            System.out.println("Pajak 15% = Rp. " + pajak);
            System.out.println("Penghasilan bersih = Rp. " + hasilBersih);
    
        } else if (N >= 251 && N <= 500) {
            System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
            N *= 1000000;
            int pajak = N * 25/100;
            int hasilBersih = N - pajak;
            System.out.println("Pajak 25% = Rp. " + pajak);
            System.out.println("Penghasilan bersih = Rp. " + hasilBersih);
        
        } else {
            System.out.println("Penghasilan kotor = " + N + " juta Rupiah" );
            N *= 1000000;
            long pajak =(long) N * 30/100;
            long hasilBersih =(long) N - pajak;
            System.out.println("Pajak 30% = Rp. " + pajak);
            System.out.println("Penghasilan bersih = Rp. " + hasilBersih);

        }
    }
}

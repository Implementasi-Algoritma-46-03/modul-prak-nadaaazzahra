import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();  // baca bilangan dari pengguna
        long hasil = 0;             // untuk menyimpan hasil pembalikan

        while (N != 0) {
            long digit = N % 10;        // ambil digit terakhir
            hasil = hasil * 10 + digit; // tambahkan ke hasil
            N = N / 10;                 // hapus digit terakhir
        }

        System.out.println(hasil);
    }
}
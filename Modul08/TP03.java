import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;q   // menyimpan total risoles
        int jumlah;      // untuk menyimpan input sementara

        jumlah = input.nextInt(); // baca angka pertama

        while (jumlah != 0) {    // berhenti jika input 0
            total += jumlah;     // tambahkan ke total
            jumlah = input.nextInt(); // baca angka berikutnya
        }

        System.out.println(total); // tampilkan total akhir
    }
}

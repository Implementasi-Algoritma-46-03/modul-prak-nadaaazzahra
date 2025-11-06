import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();  // membaca jumlah target amoeba

        long jumlah = 30;  // jumlah awal amoeba
        int waktu = 0;     // total waktu (menit)

        // selama jumlah amoeba masih kurang dari target N
        while (jumlah < N) {
            jumlah *= 2;   // amoeba membelah diri
            waktu += 15;   // tiap pembelahan butuh 15 menit
        }

        System.out.println(waktu);
    }
}
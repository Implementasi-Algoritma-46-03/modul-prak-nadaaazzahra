import java.util.Scanner; // Untuk membaca input

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); // Input ukuran matriks NxN

        int mulai = 0;   // batas kiri & atas
        int counter = 0; // angka yang akan diisi (1,2,3,...)
        int akhir = N;   // batas kanan & bawah
        int loop = 0;    // offset setiap putaran spiral

        int[][] matriks = new int[N][N]; // membuat array 2D NxN

        // Mengisi matriks dalam bentuk spiral
        while (akhir > 0) {

            // 1) Mengisi kolom kiri dari atas ke bawah
            for (int i = mulai; i < akhir; i++) {
                counter++;
                matriks[i + loop][mulai + loop] = counter;
            }

            akhir--; // batas bawah naik ke atas

            // 2) Mengisi baris bawah dari kiri ke kanan
            for (int i = mulai; i < akhir; i++) {
                counter++;
                matriks[akhir + loop][i + 1 + loop] = counter;
            }

            // 3) Mengisi kolom kanan dari bawah ke atas
            for (int i = mulai; i < akhir; i++) {
                counter++;
                matriks[akhir - i - 1 + loop][akhir + loop] = counter;
            }

            akhir--; // mempersempit lingkaran spiral

            // 4) Mengisi baris atas dari kanan ke kiri
            for (int i = mulai; i < akhir; i++) {
                counter++;
                matriks[mulai + loop][akhir - i + loop] = counter;
            }

            loop++; // berpindah ke "lingkaran spiral" berikutnya
        }

        // Menampilkan matriks
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriks[i][j]);

                if (j < N - 1)
                    System.out.print(" "); // spasi antar kolom
            }
            System.out.println();
        }
    }
}

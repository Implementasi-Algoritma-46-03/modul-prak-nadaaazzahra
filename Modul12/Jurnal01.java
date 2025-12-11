import java.util.Scanner;  // Mengimpor class Scanner untuk membaca input dari user

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);  // Membuat objek Scanner

        int N = s.nextInt();  // Membaca input pertama sebagai ukuran matriks (N x N)

        int[][] matriks = new int[N][N];  // Membuat array 2D berukuran N baris dan N kolom

        // Mengisi matriks dengan input dari pengguna
        for (int i = 0; i < N; i++) {          // Loop untuk baris
            for (int j = 0; j < N; j++) {      // Loop untuk kolom
                matriks[i][j] = s.nextInt();   // Mengisi elemen matriks
            }
        }

        // Mencetak matriks dimulai dari baris terakhir sampai baris pertama
        for (int i = N - 1; i >= 0; i--) {     // Loop dari baris paling bawah ke atas
            for (int j = 0; j < N; j++) {      // Loop untuk kolom kiri ke kanan
                System.out.print(matriks[i][j]);  // Cetak elemen matriks

                if (j < N - 1)                  // supaya rapih dan terbaca 
                    System.out.print(" ");      
            }
            System.out.println();  // Pindah ke baris baru setelah satu baris selesai dicetak
        }
    }
}


import java.util.Scanner; // Untuk input data dari keyboard

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in); // Membuat scanner

        int N = s.nextInt(); // Membaca ukuran matriks (harus 3x3 untuk tic tac toe)
        int[][] matriks = new int[N][N]; // Membuat array 2D

        // --- INPUT MATRIKS ---
        for (int i = 0; i < N; i++) {        // Loop baris
            for (int j = 0; j < N; j++) {    // Loop kolom
                matriks[i][j] = s.nextInt(); // Mengisi elemen matriks
            }
        }

        int hasil = pemenang(matriks); // Menentukan pemenang tic tac toe

        if (hasil == 1) {                // Jika pemenang adalah 1
            System.out.println("O");     // Cetak O
        } 
        else if (hasil == 2) {           // Jika pemenang adalah 2
            System.out.println("X");     // Cetak X
        } 
        else {
            // Tidak ada pemenang → cek apakah seri
            if (seri(matriks)) {
                System.out.println("-"); // Seri
            } else {
                System.out.println("?"); // Belum selesai / kondisi tidak valid
            }
        }
    }

    // ------------------------------
    // Fungsi untuk menentukan pemenang
    // ------------------------------
    private static int pemenang(int[][] matriks) {

        // Cek baris
        for (int i = 0; i < matriks.length; i++) {
            if (matriks[i][0] == matriks[i][1] &&   // Kolom 0 = kolom 1
                matriks[i][1] == matriks[i][2] &&   // Kolom 1 = kolom 2
                matriks[i][0] != 0)                  // Tidak boleh 0
            {
                return matriks[i][0]; // Kembalikan nilai 1 (O) atau 2 (X)
            }
        }

        // Cek kolom
        for (int j = 0; j < matriks.length; j++) {
            if (matriks[0][j] == matriks[1][j] &&   // Baris 0 = baris 1
                matriks[1][j] == matriks[2][j] &&   // Baris 1 = baris 2
                matriks[0][j] != 0)
            {
                return matriks[0][j]; // Kembalikan 1 atau 2
            }
        }

        // Cek diagonal utama (kiri atas → kanan bawah)
        if (matriks[0][0] == matriks[1][1] &&
            matriks[1][1] == matriks[2][2] &&
            matriks[0][0] != 0)
        {
            return matriks[0][0];
        }

        // Cek diagonal kedua (kanan atas → kiri bawah)
        if (matriks[2][0] == matriks[1][1] &&
            matriks[1][1] == matriks[0][2] &&
            matriks[2][0] != 0)
        {
            return matriks[2][0];
        }

        return 0; // Tidak ada pemenang
    }

    // ------------------------------
    // Fungsi untuk cek apakah pertandingan seri
    // ------------------------------
    private static boolean seri(int[][] matriks) {

        // Jika ada elemen bernilai 0 → belum penuh → belum seri
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks.length; j++) {
                if (matriks[i][j] == 0) {
                    return false; 
                }
            }
        }

        return true; // Tidak ada 0 → papan penuh → seri
    }
}

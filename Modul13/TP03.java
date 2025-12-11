import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();  // jumlah mahasiswa
        int[] nilai = new int[n];

        // input array nilai
        for (int i = 0; i < n; i++) {
            nilai[i] = s.nextInt();
        }

        int key = s.nextInt();   // nilai yang dicari
        int index = -1;

        // Proses Linear Search
        for (int i = 0; i < n; i++) {
            if (nilai[i] == key) {
                index = i;
                break;
            }
        }

        // Output
        if (index != -1) {
            System.out.println("Ditemukan di indeks ke-" + index);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}

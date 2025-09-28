import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: nama, jumlah barang, dan harga per barang
        String nama = input.next();
        int jumlahBarang = input.nextInt();
        int hargaPerBarang = input.nextInt();

        // Hitung total
        int total = jumlahBarang * hargaPerBarang;

        // Output sesuai format
        System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah.");

        input.close();
    }
}
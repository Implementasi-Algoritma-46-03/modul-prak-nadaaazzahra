import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.next();
        int jumlahBarang = input.nextInt();
        int hargaPerBarang = input.nextInt();
        int totalBelanja = jumlahBarang * hargaPerBarang;
        System.out.println("Hi, " + nama + ". Total belanja adalah " + totalBelanja + " rupiah.");
        input.close();

    }
}

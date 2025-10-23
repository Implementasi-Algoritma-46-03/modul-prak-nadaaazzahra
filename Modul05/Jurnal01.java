import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int kodeMenu = input.nextInt();
        int jumlahPesanan = input.nextInt();

        String menu = "";
        int harga = 0;
        switch (kodeMenu) {
            case 1:
            menu = "Nasi Goreng";
            harga = 15000/1000;
        break;
            case 2:
            menu = "Mie Goreng / Nyemek";
            harga = 18000/1000;
        break;
            case 3:
            menu = "Kwetiau Goreng / Nyemek";
            harga = 20000/1000;
        break;
            case 4:
            menu = "Capcay Goreng / Kuah";
            harga = 23000/1000;
        }
        int totalHarga = jumlahPesanan * harga;
        System.out.println(menu + " " + jumlahPesanan + " buah, total harga Rp. " + totalHarga + ".000");
                                                                                                                                                                                                                                                                            
    }
}

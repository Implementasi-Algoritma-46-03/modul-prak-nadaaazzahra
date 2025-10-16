import java.util.Scanner;
public class TP01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tabunganAwal = input.nextInt();
        int tabunganHarian = input.nextInt();
        int jumlahHari = input.nextInt();
        int totalTabungan = tabunganAwal + (tabunganHarian * jumlahHari);
        System.out.println(totalTabungan);
        input.close();
    }
}

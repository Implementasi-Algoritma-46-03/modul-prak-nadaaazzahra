import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String namaHari = input.nextLine();
        int bilangan = input.nextInt();
        int hari = 0;

        switch (namaHari) {
            case "Senin":
            hari = 0;
        break;
            case "Selasa":
            hari = 1;
        break;
            case "Rabu":
            hari = 2;
        break;
            case "Kamis":
            hari = 3;
        break;
            case "Jum'at":
            hari = 4;
        break;
            case "Sabtu":
            hari = 5;
        break;
            case "Minggu":
            hari = 6;
        break;
        default:
        System.out.println("Nama Hari Tidak Valid");
        }

        int hasilIndex = (hari + bilangan) % 7;

        String hasilHari = "";

        switch (hasilIndex) {
            case 0:
            hasilHari = "Senin";
        break;
            case 1:
            hasilHari = "Selasa";
        break;
            case 2:
            hasilHari = "Rabu";
        break;
            case 3:
            hasilHari = "Kamis";
        break;
            case 4:
            hasilHari = "Jum'at";
        break;
            case 5:
            hasilHari = "Sabtu";
        break;
            case 6:
            hasilHari = "Minggu";
        break;
        }
        System.out.println(hasilHari);
    }
}

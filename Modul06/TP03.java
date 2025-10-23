import java.util.Scanner;

public class TP03 {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaBangun = input.nextLine().trim();

        switch (namaBangun.toLowerCase()) {
            case "persegi":
                int sisi = input.nextInt();
                hitungPersegi(sisi);
                break;

            case "persegi panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt();
                hitungPersegiPanjang(panjang, lebar);
                break;

            case "segitiga":
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                hitungSegitiga(alas, tinggi);
                break;

            case "lingkaran":
                int diameter = input.nextInt();
                hitungLingkaran(diameter);
                break;
        }
    }

    //persegi.
    private static void hitungPersegi(int sisi) {
        int luas = sisi * sisi;
        int keliling = 4 * sisi;
        System.out.println(luas + " " + keliling);
    }

    //persegi panjang.
     
    private static void hitungPersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        System.out.println(luas + " " + keliling);
    }

    //segitiga siku-siku.
    private static void hitungSegitiga(int alas, int tinggi) {
        double luas = 0.5 * alas * tinggi;
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        double keliling = alas + tinggi + sisiMiring;
        System.out.printf("%.0f %.0f\n", luas, keliling);
    }

    //lingkaran.
    private static void hitungLingkaran(int diameter) {
        double jariJari = diameter / 2.0;
        double luas = PI * jariJari * jariJari;
        double keliling = PI * diameter;
        System.out.printf("%.2f %.2f\n", luas, keliling);
    }
}
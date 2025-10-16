import java.util.Scanner;
public class TP03 {
    public static void main(final String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama bangun datar: ");
        String bangunDatar = scanner.nextLine().toLowerCase();

        double luas = 0;
        double keliling = 0;

        switch(bangunDatar) {

            case "persegi":
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                System.out.println((int)luas + " " + (int)keliling);
                break;

            case "persegi panjang":
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                System.out.println((int)luas + " " + (int)keliling);
                break;

            case "segitiga":
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                luas = 0.5 * alas * tinggi;
                double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
                keliling = alas + tinggi + sisiMiring;
                System.out.println((int)luas + " " + (int)keliling);
                break;

            case "lingkaran":
                System.out.print("Masukkan diameter: ");
                double diameter = scanner.nextDouble();
                double jariJari = diameter / 2;
                luas = 3.14 * jariJari * jariJari;
                keliling = 3.14 * diameter;
                System.out.printf("%.2f %.2f\n", luas, keliling);
                break;

            default:
                System.out.println("Bangun datar tidak dikenali!");
                break;
        }
    }
}


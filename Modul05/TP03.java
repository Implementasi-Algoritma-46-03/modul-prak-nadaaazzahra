import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        String bangunan = s.nextLine();
        


        switch (bangunan){
            case "Persegi":
            int sisi = s.nextInt();
            int kelilingPersegi = 4 * sisi;
            int luasPersegi = sisi * sisi;
            System.out.print(luasPersegi);
            System.out.println(" " + kelilingPersegi);break;

            case "Persegi Panjang":
            int panjang = s.nextInt();
            int lebar = s.nextInt();
            int kelilingPersegiP = 2 * (panjang + lebar);
            int luasPersegiP = panjang * lebar;
            System.out.print(luasPersegiP);
            System.out.println(" " + kelilingPersegiP);break;

            case "Segitiga":
            int alas = s.nextInt();
            int tinggi = s.nextInt();
            double luasSegitiga =Math.round (0.5f * alas * tinggi);
            double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
            double kelilingSegitiga = Math.round(alas + tinggi + sisiMiring);
            System.out.print((int)luasSegitiga + " " + (int)kelilingSegitiga);
            break;

            case "Lingkaran":
            float diameter = s.nextFloat();
            float jariJari = diameter / 2;
            double luasLingkaran = 3.14 * jariJari * jariJari;
            double kelilingLingkaran = 3.14 * diameter;
            System.out.printf("%.2f", luasLingkaran);
            System.out.printf(" " + "%.2f\n", kelilingLingkaran);
            break;
        }

    }
}

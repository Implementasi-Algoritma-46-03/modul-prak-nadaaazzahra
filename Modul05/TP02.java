import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        // hari = jumat (vendredi), indeks 4 dari total 7 hari
        int hariIni = 4;

        // hitung indeks hari ke-N setelah Jumat
        int hariSetelah = (hariIni + N) % 7;

        String hariPrancis;

        switch (hariSetelah) {
            case 0: System.out.println ("lundi"); break;     // senin
            case 1: System.out.println ("mardi"); break;     // selasa
            case 2: System.out.println ("mercredi"); break;  // rabu
            case 3: System.out.println ("jeudi"); break;     // kamis
            case 4: System.out.println ("vendredi"); break;  // jumat
            case 5: System.out.println ("samedi"); break;    // sabtu
            case 6: System.out.println ("dimanche"); break;  // minggu
        }
}
}
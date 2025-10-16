import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String hariIni = s.nextLine();
        int hariEsok = s.nextInt();
        int hariKe = 0;

        switch (hariIni){
            case "Senin": hariKe = 0;break;
            case "Selasa": hariKe = 1;break;
            case "Rabu": hariKe = 2;break;
            case "Kmais": hariKe = 3;break;
            case "Jum'at": hariKe = 4;break;
            case "Sabtu": hariKe = 5;break;
            case "Minggu": hariKe = 6;break;
        }
        int totalHari = (hariKe + (hariEsok % 7)) % 7;
        
        switch (totalHari){
            case 0: System.out.println("Senin");break;
            case 1: System.out.println("Selasa");break;
            case 2: System.out.println("Rabu");break;
            case 3: System.out.println("Kamis");break;
            case 4: System.out.println("Jum'at");break;
            case 5: System.out.println("Sabtu");break;
            case 6: System.out.println("Minggu");break;
        }
    }
}
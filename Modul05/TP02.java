import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int bilBut = s.nextInt();
        int hari = 5;

        int hariKedepan = (hari + bilBut) % 7;
        if (hariKedepan==0) hariKedepan = 7;
        
        String hariPrancis = "";

        switch (hariKedepan){
            case 1 : 
            hariPrancis = "lundi";break;

            case 2 :
            hariPrancis = "mardi";break;

            case 3:
            hariPrancis = "mercredi";break;

            case 4:
            hariPrancis = "jeudi";break;

            case 5:
            hariPrancis = "vendredi";break;

            case 6:
            hariPrancis = "samedi";break;

            case 7:
            hariPrancis = "dimanche";break;
        }
        System.out.println(hariPrancis);
    }
}

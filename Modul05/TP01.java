import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        String bulan = s.nextLine();

        String prancis = "";
        switch (bulan){
            case "januari":
            prancis = "janvier";break;

            case "februari":
            prancis = "fevrier";break;

            case "maret":
            prancis = "mars";break;

            case "april":
            prancis = "avril";break;

            case "mei":
            prancis = "mai";break;

            case "juni":
            prancis = "juin";break;

            case "juli":
            prancis = "juillet";break;

            case "agustus":
            prancis = "aout";break;

            case "september":
            prancis = "septembre";break;

            case "oktober":
            prancis = "oktobre";break;

            case "november":
            prancis = "novembre";break;

            case "desember":
            prancis = "decembre";break;
        }
        System.out.println(prancis);
    }
}
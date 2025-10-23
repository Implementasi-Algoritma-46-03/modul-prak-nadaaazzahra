import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String lagu = input.nextLine();

        System.out.println(vokal2(vokal1(lagu)));
    }

    private static String vokal1(String lagu) {
        int sisaBagi = lagu.length() % 5;
        String hasil = null; 

        switch (sisaBagi) {
            case 0:
                hasil = lagu.replaceAll("[aiueo]", "a");
                break;
            case 1:
                hasil = lagu.replaceAll("[aiueo]", "e");
                break;
            case 2:
                hasil = lagu.replaceAll("[aiueo]", "i");
                break;
            case 3:
                hasil = lagu.replaceAll("[aiueo]", "o");
                break;
            case 4:
                hasil = lagu.replaceAll("[aiueo]", "u");
                break;
        }

        return hasil;
    }

    private static String vokal2(String vokal1) {
        int sisaBagi = vokal1.length() % 5;
        String hasil = null; 

        switch (sisaBagi) {
            case 0:
                hasil = vokal1.replaceAll("[AIUEO]", "A");
                break;
            case 1:
                hasil = vokal1.replaceAll("[AIUEO]", "E");
                break;
            case 2:
                hasil = vokal1.replaceAll("[AIUEO]", "I");
                break;
            case 3:
                hasil = vokal1.replaceAll("[AIUEO]", "O");
                break;
            case 4:
                hasil = vokal1.replaceAll("[AIUEO]", "U");
                break;
        }

        return hasil;
    }
}

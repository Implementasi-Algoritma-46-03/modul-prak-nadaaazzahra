import java.util.Scanner;

public class TP02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimatAsli = input.nextLine();
        String kalimatTanpaVokal = hapusVokal(kalimatAsli);

        System.out.println(kalimatTanpaVokal);
    }
    
    private static String hapusVokal(String kalimat) {
        return kalimat.replaceAll("[aAiIuUeEoO]", "");
    }
    
}
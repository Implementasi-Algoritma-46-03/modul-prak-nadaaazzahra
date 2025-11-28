import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        String kalimat = s.nextLine();

        kalimat = kalimat.trim();

        if (kalimat.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] kata = kalimat.split(" +");

        System.out.println(kata.length);
    }
}

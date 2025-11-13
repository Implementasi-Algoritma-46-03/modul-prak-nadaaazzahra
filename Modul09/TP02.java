import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String kalimat = s.nextLine();

        int jumlahVokal = hitungVokal(kalimat);

        System.out.println(jumlahVokal);

        s.close();
    }

    private static int hitungVokal(String teks) {
        int jumlah = 0;

        for (int i = 0; i < teks.length(); i++) {
            char huruf = teks.charAt(i);
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o' ||
                huruf == 'A' || huruf == 'I' || huruf == 'U' || huruf == 'E' || huruf == 'O') {
                jumlah++;
            }
        }

        return jumlah;
    }
}

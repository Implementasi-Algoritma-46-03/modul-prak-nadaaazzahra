import java.util.Scanner;

public class TP01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine(); 

        String[] peserta = new String[n];

        for (int i = 0; i < n; i++) {
            peserta[i] = s.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + peserta[i]);
        }
    }
}

import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        int N = input.nextInt();
        int T = input.nextInt();

        //proses
        int perOrang = N / (T + 1);
        int sisa     = N % (T + 1);

        //output
        System.out.println(perOrang);
        System.out.println(sisa);

        //tutup Scanner
        input.close();
    }
}

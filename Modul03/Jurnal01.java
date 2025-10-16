import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        //input
        int jumlahUang = s.nextInt();

        //proses
        int jumlahLembar = jumlahUang / 1000;
        int sisa = jumlahUang % 1000;

        //output
        System.out.println(jumlahLembar);
        System.out.println(sisa);
    }
}

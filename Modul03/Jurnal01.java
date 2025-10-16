import java.util.Scanner;

public class Jurnal01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahUang = input.nextInt();

        int lembar = jumlahUang / 1000;
        int sisa = jumlahUang % 1000;

        System.out.println(lembar);
        System.out.println(sisa);
    }
}
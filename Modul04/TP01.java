import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        //input nilai N
        int n = input.nextInt();

        //cek nilai N apakah kelipatan
        if (n % 6 == 0) {
            System.out.println("Kelipatan Enam");
        } else {
            System.out.println("Bukan Kelipatan Enam");
        }


    }
}

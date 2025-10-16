import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if ( n % 6 == 0){
            System.out.println("Kelipatan enam");
        } else {
            System.out.println("Bukan kelipatan enam");
        }
    }
}
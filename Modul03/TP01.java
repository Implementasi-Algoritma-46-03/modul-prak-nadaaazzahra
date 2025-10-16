import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner (System.in);

        //input 
        int x = input.nextInt();
        int y = input.nextInt();
        int n = input.nextInt();

        //proses
        int total = x + (y * n);

        //output
        System.out.println(total);
    }
}

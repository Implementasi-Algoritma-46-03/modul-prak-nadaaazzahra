import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int d = input.nextInt();
        int r = input.nextInt();
        int i = input.nextInt();

        if (d > r && d > i){
            System.out.println("Dira");
        }  else if (r > d && r > i) {
            System.out.println("Radi");
        }  else {
            System.out.println("Idar");
        }
    }
}

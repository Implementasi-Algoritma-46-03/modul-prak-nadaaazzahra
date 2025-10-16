import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int d = s.nextInt();
        int r = s.nextInt();
        int i = s.nextInt();

        if (d < r && d < i){
            if (r < i){
                System.out.println("Dira, Radi, Idar");
            } else if (r > i){
                System.out.println("Dira, Idar, Radi");
            }
        }else if (r < d && r < i){
            if (d < i){
                System.out.println("Radi, Dira, Idar");
            } else if (d > i){
                System.out.println("Radi, Idar, Dira");
            }
        } else if ( i < r && i < d){
            if (r < d){
                System.out.println("Idar, Radi, Dira");
            }else if (r > d){
                System.out.println("Idar, Dira, Radi");
            }
        }
    }
}
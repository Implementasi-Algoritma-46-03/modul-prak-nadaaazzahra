import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini 
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int r = input.nextInt();
        int i = input.nextInt();

        if (d<r && d<i) {
            if (r<i)
            System.out.println("Dira, Radi, Idar");
            else 
            System.out.println("Dira, Idar, Radi");

        }else if (r<d && r<i) {
            if (d<i)
            System.out.println("Radi, Dira, Idar");
            else
            System.out.println("Radi, Idar, Dira");

        }else if (i<d && i<r) {
            if (d<r)
            System.out.println("Idar, Dira, Radi");
            else 
            System.out.println("Idar, Radi, Dira");
         }
     }
 }




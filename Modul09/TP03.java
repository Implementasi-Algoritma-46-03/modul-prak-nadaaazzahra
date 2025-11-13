import java.util.Scanner;

public class TP03 {
   
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(faktorial(n));
    }

    private static int faktorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * faktorial(n - 1);
    }
}
        
    
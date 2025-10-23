import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini 
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        if (24 % n == 0 && 56 % n == 0)
        System.out.println("Faktor dari 24 dan 56");

        else
        System.out.println("Bukan faktor dari 24 dan 56");

    }
}

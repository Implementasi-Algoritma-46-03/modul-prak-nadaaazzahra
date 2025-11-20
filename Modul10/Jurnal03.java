import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputan = sc.nextInt();
        int pola = 0;

        for (int i = inputan; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(pola);
                pola++;
                if (pola == 10){
                    pola = 0;
                }

            }
            System.out.println();
        }

        sc.close();
}
}

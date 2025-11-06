import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double R = input.nextDouble(); 
        double N = input.nextDouble(); 
        double sisa = R; 
        int hari = 0;

        while (hari < N) {         
            sisa = sisa / 2;       
            hari = hari + 10;      
        }

        System.out.printf("%.3f", sisa); // tampilkan hasil
        input.close();
    }
}


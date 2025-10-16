import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        //input
        int nilaiP = s.nextInt();
        int nilaiA = s.nextInt();
        int nilaiB = s.nextInt();

        //proses hitung
        double nilaiStatus =(0.25 * nilaiP) + (0.35 * nilaiA) + (0.4 * nilaiB);
        
        // proses ngecek
        boolean MK = true;
        if (nilaiStatus >= 75){
            MK = true;
        } else if (nilaiStatus < 75){
            MK = false;
        }

        //output
        System.out.printf("%.2f%n",nilaiStatus);
        System.out.println("Lulus MK: " + MK);
    }
}


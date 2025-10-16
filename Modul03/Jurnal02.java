import java.util.Scanner; 

public class Jurnal02 {

    public static void main(final String[] args) {
         Scanner sc = new Scanner(System.in);

         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
  
         double rataRata = (a + b + c)/3.0;

         System.out.printf("Nilai rata-rata: %.2f", rataRata);
      Scanner input = new Scanner(System.in);

      //input
      double nilaiA = input.nextDouble();
      double nilaiB = input.nextDouble();
      double nilaiC = input.nextDouble();

      double nilaiRataRata = (nilaiA + nilaiB + nilaiC) / 3.0;

      System.out.printf("Nilai rata-rata: %.2f\n", nilaiRataRata);
        input.close();
    }
}
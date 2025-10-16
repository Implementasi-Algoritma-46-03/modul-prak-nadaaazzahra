import java.util.Scanner;

public class TP02 {
   public TP02() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Masukkan jumlah hari setelah Jumat: ");
      int var2 = var1.nextInt();
      int var3 = var2 % 7;
      switch (var3) {
         case 0:
            System.out.println("vendredi");
            break;
         case 1:
            System.out.println("samedi");
            break;
         case 2:
            System.out.println("dimanche");
            break;
         case 3:
            System.out.println("lundi");
            break;
         case 4:
            System.out.println("mardi");
            break;
         case 5:
            System.out.println("mercredi");
            break;
         case 6:
            System.out.println("jeudi");
            break;
         default:
            System.out.println("Input tidak valid!");
      }

   }
}

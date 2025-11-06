import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;        
        int total = 0;     
        int orang = 0;     
        do {
            jumlah = input.nextInt();  
            total += jumlah;           
            orang++;                   
        } while (jumlah != 0);         

        orang--;                       
        double rata = (double) total / orang;   

        System.out.printf("%.2f\n", rata); 
        input.close();
    }
}

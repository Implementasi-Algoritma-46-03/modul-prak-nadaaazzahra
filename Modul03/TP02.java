import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner (System.in);
        
        //input
        String Nama = input.next();
        int  Jumlah = input.nextInt();
        int   Harga = input.nextInt();

        //proses
        int   Total = Jumlah * Harga;

        //output
        System.out.println("Hi, " + Nama + ". Total belanja adalah " + Total + " rupiah.");

        //tutup Scanner
        input.close();
    }
    }


import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: jumlah permen (N) dan jumlah teman (T)
        int N = input.nextInt(); // jumlah permen
        int T = input.nextInt(); // jumlah teman

        // Total orang = Dira + T teman
        int totalOrang = T + 1;

        // Hitung jatah per orang dan sisa permen
        int jatah = N / totalOrang;
        int sisa = N % totalOrang;

        // Output sesuai format
        System.out.println(jatah);
        System.out.println(sisa);

        input.close();
    }
}
    

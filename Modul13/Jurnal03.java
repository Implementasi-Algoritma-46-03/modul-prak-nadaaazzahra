import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        String[] b = new String[a]; 

        for (int i = 0; i < b.length; i++) {
            b[i]= scan.next().trim();
        }

        String c = scan.next().trim();
        boolean isFound = false;

        for (int i = 0; i < b.length; i++) {
            if(b[i].equals(c)){
                System.out.printf("Ditemukan di indeks ke-%d", i + 1);
                isFound = true;
                break;
            }     
        }
        if(!isFound){
            System.out.print("Data tidak ditemukan");
        }

        scan.close();
    }
}
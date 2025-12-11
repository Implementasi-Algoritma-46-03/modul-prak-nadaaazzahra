import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String[] b = new String[a];

        for (int i = 0; i < b.length; i++) { // membaca setiap kata dan memasukkannya ke dalam array
            b[i]= scan.next().trim(); // menghapus spasi berlebihan didepan satu atau belakang
        }

        for (int i = 0; i < b.length; i++) {
            String key = b[i]; // elemen yang sedang diurutkan 
            int j = i - 1; 

            while(j >= 0 && b[j].compareToIgnoreCase(key) < 0){ // membandingkan string tanpa melihat besar kecil hurufnya
                b[j + 1] = b[j]; // jika keil maka
                j -= 1;
            }

            b[j + 1] = key;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.printf("%s ", b[i]);
        }

        scan.close();
    }
}
import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!sc.hasNextInt()) return;
                sum += sc.nextInt(); //menjumlahkan
            }
        }
        System.out.println(sum); 
    }
}
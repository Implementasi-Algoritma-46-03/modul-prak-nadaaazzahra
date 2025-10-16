import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPermen = input.nextInt();
        int jumlahTeman = input.nextInt();
        int totalOrang = jumlahTeman + 1;
        int jatahPerOrang = jumlahPermen / totalOrang;
        int sisaPermen = jumlahPermen % totalOrang;
        System.out.println(jatahPerOrang);
        System.out.println(sisaPermen);
        input.close();
    }
}

import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        char kar = input.next().charAt(0);
        int B = input.nextInt();

        switch (kar) {
            case '+':
            System.out.println(A + B);
        break;
            case '-':
            System.out.println(A - B);
        break;
            case '*':
            System.out.println(A * B);
        break;
            case '/':
            System.out.printf("%.7f%n", (double) A / B);
        break;
        default:
        System.out.println("operasi tidak ada");
        break;
        }
    }
    
}

import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char o = s.next().charAt(0);
        int b = s.nextInt();


        switch (o){
            case '+': int formula = a + b;
            System.out.println(formula);break;

            case '-': int formula2 = a - b;
            System.out.println(formula2);break;

            case '*': int formula3 = a * b;
            System.out.println(formula3);break;

            case '/': double formula4 = (double)a / b;
            System.out.printf("%.7f", formula4);break;
        }
    }
}

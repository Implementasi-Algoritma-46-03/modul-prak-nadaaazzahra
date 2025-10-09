import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int dira = input.nextInt();
        int radi = input.nextInt();
        int idar = input.nextInt();
        input.close();

        if (dira == radi || dira == idar || radi == idar) {
            System.out.println("eror nilai tidak boleh sama");
        }else if (dira > radi && dira > idar && radi > idar){
            System.out.println("Idar, Radi, Dira");
        }else if (dira > radi && dira > idar && idar > radi){
            System.out.println("Radi, Idar, Dira");
        }else if (radi > dira && radi > idar && dira >idar) {
            System.out.println("Dira, Idar, Radi");
        }else if (radi > dira && radi > idar && dira > idar) {
            System.out.println("Idar,Dira,Radi");
        }else if (idar > dira && idar > radi && radi > dira) {
            System.out.println("Dira, Radi, Idar");
        }else if (idar > dira && idar > radi && dira > radi) {
            System.out.println("Radi,Dira,Idar");
        }

    } 
}

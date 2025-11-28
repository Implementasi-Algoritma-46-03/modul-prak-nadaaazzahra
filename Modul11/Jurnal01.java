import java.util.ArrayList;
import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList < String > nama = new ArrayList<>();
        String input;

        do{
            input = s.nextLine();
            if (input.equals("-")){
                break;
            }
            nama.add(input);
        } while (input != "-");

        for (int i = 0; i < nama.size(); i++){

            System.out.println("Bulan " + (i + 1) + ": " + nama.get(i));
        }
    }
}



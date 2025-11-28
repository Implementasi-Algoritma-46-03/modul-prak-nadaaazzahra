import java.util.Scanner;
import java.util.ArrayList;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int input;
        int hasil = 0;
        int hasilAkhir = 0;
        int modus = 0;

        ArrayList<Integer>angka = new ArrayList<>();
        
        do{
            input = s.nextInt();
            if (input !=-1)
                angka.add(input);
        } while (input !=-1);

    for (int i=0; i<angka.size(); i++) {
        for (int j=i; j<angka.size(); j++){
            if (angka.get(i) == angka.get(j));
            hasil++;
        }
        if (hasil >= hasilAkhir){
            modus = angka.get(i);
            hasilAkhir = hasil;
        }
    }
    System.out.println(modus);
    }
}

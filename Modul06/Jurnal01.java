import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String nama1 = input.nextLine();
        String nama2 = input.nextLine();
        int sapaan = input.nextInt();
    
        greeting(nama1,sapaan);
        greeting(nama2,sapaan);

        }
        private static void greeting(String nama,int waktu){
            System.out.print("Halo, " + nama);
            if (waktu >= 6 && waktu <= 11){
            System.out.println(". Selamat pagi.");  
            } else if (waktu >= 12 && waktu <= 14){
                System.out.println("Selamat siang");
            } else if (waktu >= 15 && waktu <= 17){
                System.out.println(". Selamat sore.");
            } else if (waktu >= 18 && waktu <= 05){
                System.out.println("Selamat malam");
            }
        }
    }
        

public class TP03 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int n = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    n++;
                }
            }

            if (n == 2) { // hanya 1 dan dirinya sendiri
                System.out.print(i + " ");
            }
        }
    }
}

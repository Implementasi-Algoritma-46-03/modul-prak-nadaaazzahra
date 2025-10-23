import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
     Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double h = input.nextDouble();
        double t = input.nextDouble();

        double volumeMaks = hitungVolume(r, h);
        double volumeAir = hitungVolume(r, t);
        double persen = hitungPersen(t, h);

        System.out.printf("%.2f %.2f %.1f%%", volumeMaks, volumeAir, persen);
    }
    private static double hitungVolume(double r, double tinggi) {
        return 3.14156 * r * r * tinggi;
    }
    private static double hitungPersen(double t, double h) {
        return (t / h) * 100;
    }
}
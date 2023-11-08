package Tugas;
import java.util.Scanner;

public class KriteriaKegemukan {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = scanner.nextDouble();
        System.out.print("Masukkan Tinggi Badan (m): ");
        double tinggiBadan = scanner.nextDouble();

        // Hitung IMT
        double imt = hitungIMT(beratBadan, tinggiBadan);

        // Tentukan kriteria kegemukan
        String kriteria = tentukanKriteria(imt);

        // Output
        System.out.println("\nBerat Badan : " + beratBadan + " kg");
        System.out.println("Tinggi Badan : " + tinggiBadan + " m");
        System.out.println("IMT : " + imt);
        System.out.println("Kriteria : " + kriteria);
    }

    private static double hitungIMT(double beratBadan, double tinggiBadan) {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    private static String tentukanKriteria(double imt) {
        if (imt < 18.5) {
            return "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt < 25) {
            return "Berat Badan Ideal";
        } else if (imt >= 25 && imt < 30) {
            return "Berat Badan Lebih";
        } else if (imt >= 30 && imt < 40) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
}

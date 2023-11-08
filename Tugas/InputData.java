package Tugas;
import java.util.Scanner;
public class InputData {

        public static void main(String[] args) {
            // Input
            Scanner scanner = new Scanner(System.in);
            System.out.print("NPM : ");
            String npm = scanner.nextLine();
            System.out.print("Nama Mahasiswa : ");
            String namaMahasiswa = scanner.nextLine();
            System.out.print("Nilai Kehadiran : ");
            double nilaiKehadiran = scanner.nextDouble();
            System.out.print("Nilai Tugas : ");
            double nilaiTugas = scanner.nextDouble();
            System.out.print("Nilai UTS : ");
            double nilaiUTS = scanner.nextDouble();
            System.out.print("Nilai UAS : ");
            double nilaiUAS = scanner.nextDouble();

            // Hitung nilai akhir, grade, dan keterangan
            double nilaiAkhir = hitungNilaiAkhir(nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
            String grade = konversiGrade(nilaiAkhir);
            String keterangan = getKeterangan(grade);

            // Output
            System.out.println("\nTampilan Output");
            System.out.println("NPMMahasiswa : " + npm);
            System.out.println("Nama Mahasiswa : " + namaMahasiswa);
            System.out.println("Nilai Rata-rata : " + nilaiAkhir);
            System.out.println("Grade : " + grade);
            System.out.println("Keterangan : " + keterangan);
        }

        private static double hitungNilaiAkhir(double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
            return (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        }

        private static String konversiGrade(double nilaiAkhir) {
            if (nilaiAkhir >= 76) {
                return "A";
            } else if (nilaiAkhir >= 66) {
                return "B";
            } else if (nilaiAkhir >= 56) {
                return "C";
            } else if (nilaiAkhir >= 46) {
                return "D";
            } else {
                return "E";
            }
        }

        private static String getKeterangan(String grade) {
            switch (grade) {
                case "A":
                    return "ISTIMEWA";
                case "B":
                    return "BAIK";
                case "C":
                    return "CUKUP";
                case "D":
                    return "KURANG";
                default:
                    return "KURANG SEKALI";
            }
        }
    }


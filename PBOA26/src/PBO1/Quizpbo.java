package PBO1;

import java.util.Scanner;

public class Quizpbo {

    // Method untuk menghitung nilai akhir
    public static double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (0.30 * tugas) + (0.30 * uts) + (0.40 * uas);
    }

    // Method untuk menentukan huruf
    public static char tentukanHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return 'A';
        } else if (nilaiAkhir >= 70) {
            return 'B';
        } else if (nilaiAkhir >= 60) {
            return 'C';
        } else if (nilaiAkhir >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }

    // Method untuk menentukan status
    public static String tentukanStatus(char huruf) {
        if (huruf == 'A' || huruf == 'B' || huruf == 'C') {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    // Method untuk input nilai dengan validasi 0-100
    public static double inputNilai(Scanner input, String namaNilai) {
        double nilai;

        while (true) {
            System.out.print(namaNilai + " : ");
            nilai = input.nextDouble();

            if (nilai >= 0 && nilai <= 100) {
                return nilai;
            } else {
                System.out.println("Nilai tidak valid! Masukkan nilai 0-100.");
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("==============================================");
            System.out.println("       SISTEM PENGOLAHAN NILAI MAHASISWA");
            System.out.println("==============================================");
            
            // Input jumlah mahasiswa
            System.out.print("Masukkan jumlah mahasiswa : ");
            int jumlah = input.nextInt();
            input.nextLine();
            
            // Array
            String[] npm = new String[jumlah];
            String[] nama = new String[jumlah];
            double[] tugas = new double[jumlah];
            double[] uts = new double[jumlah];
            double[] uas = new double[jumlah];
            double[] nilaiAkhir = new double[jumlah];
            char[] huruf = new char[jumlah];
            String[] status = new String[jumlah];
            
            // Looping input data mahasiswa
            for (int i = 0; i < jumlah; i++) {
                
                System.out.println("\n----------------------------------------------");
                System.out.println("Data Mahasiswa Ke-" + (i + 1));
                System.out.println("----------------------------------------------");
                
                System.out.print("NPM   : ");
                npm[i] = input.nextLine();
                
                System.out.print("Nama  : ");
                nama[i] = input.nextLine();
                
                tugas[i] = inputNilai(input, "Nilai Tugas");
                uts[i] = inputNilai(input, "Nilai UTS");
                uas[i] = inputNilai(input, "Nilai UAS");
                
                // Menghitung nilai akhir
                nilaiAkhir[i] = hitungNilaiAkhir(
                        tugas[i],
                        uts[i],
                        uas[i]
                );
                
                // Menentukan grade
                huruf[i] = tentukanHuruf(nilaiAkhir[i]);
                
                // Menentukan status
                status[i] = tentukanStatus(huruf[i]);
                
                input.nextLine();
            }
            
            // ==========================================
            // OUTPUT TABEL
            // ==========================================
            
            System.out.println("\n\n==============================================================");
            System.out.println("                  DAFTAR NILAI MAHASISWA");
            System.out.println("==============================================================");
            
            System.out.printf(
                    "%-4s %-12s %-15s %-8s %-8s %-8s %-10s %-8s %-12s%n",
                    "No", "NPM", "Nama", "Tugas", "UTS",
                    "UAS", "Nilai Akhir", "Huruf", "Status"
            );
            
            System.out.println("--------------------------------------------------------------");
            
            for (int i = 0; i < jumlah; i++) {
                
                System.out.printf(
                        "%-4d %-12s %-15s %-8.1f %-8.1f %-8.1f %-10.1f %-8c %-12s%n",
                        (i + 1),
                        npm[i],
                        nama[i],
                        tugas[i],
                        uts[i],
                        uas[i],
                        nilaiAkhir[i],
                        huruf[i],
                        status[i]
                );
            }
            
            // ==========================================
            // STATISTIK NILAI
            // ==========================================
            
            int jumlahLulus = 0;
            int jumlahTidakLulus = 0;
            
            double totalNilai = 0;
            double nilaiTertinggi = nilaiAkhir[0];
            double nilaiTerendah = nilaiAkhir[0];
            
            for (int i = 0; i < jumlah; i++) {
                
                totalNilai += nilaiAkhir[i];
                
                if (status[i].equals("LULUS")) {
                    jumlahLulus++;
                } else {
                    jumlahTidakLulus++;
                }
                
                if (nilaiAkhir[i] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiAkhir[i];
                }
                
                if (nilaiAkhir[i] < nilaiTerendah) {
                    nilaiTerendah = nilaiAkhir[i];
                }
            }
            
            double rataRata = totalNilai / jumlah;
            
            System.out.println("\n==============================================================");
            System.out.println("                     STATISTIK NILAI");
            System.out.println("==============================================================");
            
            System.out.println("Jumlah Mahasiswa    : " + jumlah);
            System.out.println("Jumlah Lulus        : " + jumlahLulus);
            System.out.println("Jumlah Tidak Lulus  : " + jumlahTidakLulus);
            System.out.printf("Nilai Tertinggi     : %.1f%n", nilaiTertinggi);
            System.out.printf("Nilai Terendah      : %.1f%n", nilaiTerendah);
            System.out.printf("Rata-rata Kelas     : %.1f%n", rataRata);
            
            System.out.println("==============================================================");
        }
    }
}
            

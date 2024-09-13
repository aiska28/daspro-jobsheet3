import java.util.Scanner;

/**
 * Siakad04
 */
public class Siakad04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUas, nilaiAkhir;

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan nomer absen: ");
        absen = sc.nextByte();

        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        System.out.println("Masukkan nilai uas");
        nilaiUas = sc.nextDouble();


        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian + nilaiUas) / 3;

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + "absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        
            
        }
        
    }

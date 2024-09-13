import java.util.Scanner;

/**
 * Kafe4
 */
public class Kafe4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100;

        System.out.println("Masukkan keanggotan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembeli kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembeli teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembeli roti: ");
        jmlRoti = input.nextInt();

        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        byte totalByte = (byte) totalHarga;
        double nominalBayar = totalHarga - (diskon * totalHarga);
        int nominalInt = (int) nominalBayar;

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembeli " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti ");
        System.out.println("Nominal bayar Rp " + nominalBayar);

    }
}

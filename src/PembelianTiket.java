import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Program PembelianTiket menghitung total harga tiket berdasarkan jumlah tiket yang dibeli
 * dan memformat hasilnya sebagai mata uang Rupiah.
 */
public class PembelianTiket {
    public static void main(String[] args) {
        // Harga tiket dalam Rupiah
        int hargaTiket = 50000;

        // Input dari pengguna
        Scanner scanner = new Scanner(in);
        out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();

        // Menghitung total harga
        int totalHarga = hargaTiket * jumlahTiket;

        // Output hasil
        out.println("Anda telah membeli " + jumlahTiket + " tiket.");
        out.println("Total harga: " + formatRupiah(totalHarga));
    }

    /**
     * Mengonversi angka integer ke format mata uang Rupiah dengan pemisah ribuan.
     *
     * @param amount Jumlah yang akan diformat sebagai mata uang Rupiah.
     * @return String yang merupakan jumlah dalam format mata uang Rupiah.
     */
    public static String formatRupiah(int amount) {
        String rupiah = "Rp ";
        String amountString = Integer.toString(amount);
        int length = amountString.length();
        int count = 0;

        for (int i = length - 1; i >= 0; i--) {
            rupiah = amountString.charAt(i) + rupiah;
            count++;
            if (count == 3 && i != 0) {
                rupiah = "." + rupiah;
                count = 0;
            }
        }

        return rupiah;
    }
}

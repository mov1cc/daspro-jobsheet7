import java.util.Scanner;
public class Bioskop12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;
        final int HARGA_TIKET = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk berhenti): ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.\n");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalHarga = jumlahTiket * HARGA_TIKET * (1 - diskon);

            System.out.println("Total harga untuk pelanggan ini: Rp " + totalHarga + "\n");

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
        }

        System.out.println("===== REKAP PENJUALAN HARI INI =====");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);

        input.close();
    }
}
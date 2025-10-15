import java.util.Scanner;
public class Parkir12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = input.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Input tidak valid! Silakan masukkan 1 untuk Mobil atau 2 untuk Motor.\n");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) { // mobil
                total += durasi * 3000;
            } else if (jenis == 2) { // motor
                total += durasi * 2000;
            }

            System.out.println("Total sementara: Rp " + total + "\n");
        }

        System.out.println("===================================");
        System.out.println("Total pembayaran parkir hari ini: Rp " + total);
        System.out.println("Terima kasih!");
        input.close();
    }
}
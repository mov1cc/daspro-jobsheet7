import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPelanggan = 0;
        int totalItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

       
        for (int cabang = 1; cabang <= jumlahCabang; cabang++) {

            System.out.println("\n--- Cabang " + cabang + " ---");
            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();

            int totalItemCabang = 0; 
           
            for (int i = 1; i <= pelanggan; i++) {
                System.out.print("- Pelanggan " + i + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

           
            System.out.println("Cabang " + cabang + ":");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            
            totalPelanggan += pelanggan;
            totalItem += totalItemCabang;
        }

        
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");
    }
}
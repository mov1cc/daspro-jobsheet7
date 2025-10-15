import java.util.Scanner;
public class kafeDoWhile12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi,teh,roti;
        String namaPelanggan;
        int hargaKopi=12000,hargaTeh=7000,hargaRoti=20000;
       
    do { 
        System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
        namaPelanggan = sc.nextLine();
        if(namaPelanggan.equalsIgnoreCase("batal")){
            System.out.println("Transaksi dibatalkan");
            break;
        }
        System.out.print("jumlah kopi : ");
        kopi = sc.nextInt();
        System.out.print("jumlah teh : ");
        teh = sc.nextInt();
        System.out.print("jumlah roti : ");
        roti = sc.nextInt();
        int totalHarga = (kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
        System.out.println("Total harga yang harus dibayar "+namaPelanggan+" adalah Rp."+totalHarga);
        sc.nextLine(); // membersihkan buffer

    } while (true);
    System.out.println("Semua transaksi selesai.");
        sc.close();
  }
}
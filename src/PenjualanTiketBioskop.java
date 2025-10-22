import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        String lanjut = "y"; 

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!\n");
                continue; 
            }

            double totalHarga = jumlah * HARGA_TIKET;

            if (jumlah > 10) {
                totalHarga -= totalHarga * 0.15; 
                System.out.println("Diskon 15% diterapkan.");
            } else if (jumlah > 4) {
                totalHarga -= totalHarga * 0.10; 
                System.out.println("Diskon 10% diterapkan.");
            }

            totalTiketTerjual += jumlah;
            totalPenjualan += totalHarga;

            System.out.printf("Total harga untuk pembelian ini: Rp %.0f\n", totalHarga);

            System.out.print("Apakah ada pelanggan lain? (y/n): ");
            lanjut = sc.next();

            System.out.println(); 
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("=== RINGKASAN PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.printf("Total penjualan     : Rp %.0f\n", totalPenjualan);
        sc.close();
    }
}

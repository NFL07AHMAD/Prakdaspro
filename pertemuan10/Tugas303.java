import java.util.Scanner;

/**
 * Tugas303
 */
public class Tugas303 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jumlahPelanggan;
    int barang;
    int totalBarang = 0;
    int totalBarangSeluruh = 0;
    int barangTerbanyak = 0;
    int tokoTerlaris = 0;
    int n;
    while (true) {
      System.out.print("Masukkan jumlah toko: ");
      n = sc.nextInt();
      if (n <= 0) {
        System.out.println("Jumlah toko tidak boleh 0 atau kurang");
        continue;
      } else {
        for (int i = 1; i <= n; i++) {
          System.out.println("======== Toko " + i + " ========");
          System.out.print("Masukkan jumlah pelanggan: ");
          jumlahPelanggan = sc.nextInt();
          totalBarang = 0;
          for (int j = 1; j <= jumlahPelanggan; j++) {
            System.out.print("barang pelanggan " + j + " : ");
            barang = sc.nextInt();
            totalBarang += barang;
          }
          System.out.println("-----------------------");
          System.out
              .println(String.format("Toko %d - pelanggan : %d, jumlah barang: %d\n", i, jumlahPelanggan, totalBarang));
          totalBarangSeluruh += totalBarang;
          if (totalBarang > barangTerbanyak) {
            barangTerbanyak = totalBarang;
            tokoTerlaris = i;
          }
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruh);
        System.out.println("Toko terlaris: " + tokoTerlaris);
        break;
      }
    }
    sc.close();
  }
}

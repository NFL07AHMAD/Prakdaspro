import java.util.Scanner;

/**
 * AhmadNaufalFebriansyah / 03 / TI-1D
 */
public class Revisi {
  class Produk {
    int hargaJual, hargaBeli, biayaKemas, biayaKirim, diskon, jumlahJual, keuntungan, keuntunganTotal;
    float resiko, jipk;

    public void konfirmasi(Runnable method) {
      Scanner sc = new Scanner(System.in);
      boolean input;

      System.out.println("Ingin lanjut? true = lanjut, false = ulang:");
      input = sc.nextBoolean();
      sc.close();

      if (input) {
        return;
      } else {
        method.run();
      }
    }

    public void hitungKeuntunganItem() {

      Scanner sc = new Scanner(System.in);

      System.out.print("Masukkan harga beli: ");
      this.hargaBeli = sc.nextInt();
      System.out.print("Masukkan harga jual: ");
      this.hargaJual = sc.nextInt();
      System.out.print("Masukkan biaya pengemasan: ");
      this.biayaKemas = sc.nextInt();
      System.out.print("Masukkan biaya pengiriman: ");
      this.biayaKirim = sc.nextInt();
      System.out.print("Masukkan diskon: ");
      this.diskon = sc.nextInt();
      sc.close();

      this.keuntungan = this.hargaJual - this.hargaBeli - this.biayaKirim - this.biayaKemas - this.diskon;
      System.out.println(String.format("Keuntungan per item produk ini adalah Rp. %,d", this.keuntungan));

      this.konfirmasi(this::hitungKeuntunganItem);
    }

    public void hitungKeuntunganTotal() {
      Scanner sc = new Scanner(System.in);

      System.out.print("Masukkan jumlah penjualan: ");
      this.jumlahJual = sc.nextInt();

      this.keuntunganTotal = this.keuntungan * this.jumlahJual;
      System.out.println(String.format("Keuntungan total produk ini adalah Rp. %,d", this.keuntunganTotal));

      this.konfirmasi(this::hitungKeuntunganTotal);
    }

    public void JumlahItemPenghitungKeuntungan() = {
      Scanner sc = new Scanner(System.in);

      System.out.println("Masukkan faktor resiko kerusakan: ");
      this.resiko = sc.nextFloat();

    }
  }

    public static void main(String[] args) {

    }
}

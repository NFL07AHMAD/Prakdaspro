import java.util.Scanner;

/**
 * MenghitungTotalBayar03
 */
public class MenghitungTotalBayar03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double harga;
    double potongan, jml_bayar, diskon = 0.15;

    System.out.println("Masukkan harga");
    harga = sc.nextInt();

    potongan = diskon * harga;
    jml_bayar = harga - potongan;

    System.out.println("Jumlah uang yang harus dibayar" + jml_bayar);

    sc.close();
  }
}

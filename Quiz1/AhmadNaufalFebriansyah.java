import java.util.Scanner;

/**
 * AhmadNaufalFebriansyah / 03 / TI-1D
 */
public class AhmadNaufalFebriansyah {

  public static void main(String[] args) {
    // Variabel untuk produk handphone
    int hargaJual1, hargaBeli1, biayaPengemasan1, biayaPengiriman1, jumlahPenjualan1, diskon1;
    float resiko1;
    int keuntungan1;
    float keuntunganProduk1;
    float jipk1; // Jumlah Item Penghitung Kuntungan

    // Variable untuk produk kabel
    int hargaJual2, hargaBeli2, biayaPengemasan2, biayaPengiriman2, jumlahPenjualan2, diskon2;
    float resiko2;
    int keuntungan2;
    float keuntunganProduk2;
    float jipk2; // Jumlah Item Penghitung Kuntungan

    // Variabel untuk produk earphone
    int hargaJual3, hargaBeli3, biayaPengemasan3, biayaPengiriman3, jumlahPenjualan3, diskon3;
    float resiko3;
    int keuntungan3;
    float keuntunganProduk3;
    float jipk3; // Jumlah Item Penghitung Kuntungan

    int targetKeuntungan;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan target keuntungan: ");
    targetKeuntungan = sc.nextInt();
    System.out.println(" ");

    // Input untuk produk Handphone
    System.out.print("Masukkan harga beli hp: ");
    hargaBeli1 = sc.nextInt();
    System.out.print("Masukkan harga jual hp: ");
    hargaJual1 = sc.nextInt();
    System.out.print("Masukkan biaya pengemasan hp: ");
    biayaPengemasan1 = sc.nextInt();
    System.out.print("Masukkan biaya pengiriman hp: ");
    biayaPengiriman1 = sc.nextInt();
    System.out.print("Masukkan diskon hp: ");
    diskon1 = sc.nextInt();
    System.out.print("Masukkan resiko kerusakan hp: ");
    resiko1 = sc.nextFloat();
    System.out.print("Masukkan jumlah penjualan hp: ");
    jumlahPenjualan1 = sc.nextInt();
    System.out.println(" ");

    // Input untuk produk kabel
    System.out.print("Masukkan harga beli kabel: ");
    hargaBeli2 = sc.nextInt();
    System.out.print("Masukkan harga jual kabel: ");
    hargaJual2 = sc.nextInt();
    System.out.print("Masukkan biaya pengemasan kabel: ");
    biayaPengemasan2 = sc.nextInt();
    System.out.print("Masukkan biaya pengiriman kabel: ");
    biayaPengiriman2 = sc.nextInt();
    System.out.print("Masukkan diskon kabel: ");
    diskon2 = sc.nextInt();
    System.out.print("Masukkan resiko kerusakan kabel: ");
    resiko2 = sc.nextFloat();
    System.out.print("Masukkan jumlah penjualan kabel: ");
    jumlahPenjualan2 = sc.nextInt();
    System.out.println(" ");

    // Input untuk produk earphone
    System.out.print("Masukkan harga beli earphone: ");
    hargaBeli3 = sc.nextInt();
    System.out.print("Masukkan harga jual earphone: ");
    hargaJual3 = sc.nextInt();
    System.out.print("Masukkan biaya pengemasan earphone: ");
    biayaPengemasan3 = sc.nextInt();
    System.out.print("Masukkan biaya pengiriman earphone: ");
    biayaPengiriman3 = sc.nextInt();
    System.out.print("Masukkan diskon earphone: ");
    diskon3 = sc.nextInt();
    System.out.print("Masukkan resiko kerusakan earphone: ");
    resiko3 = sc.nextFloat();
    System.out.print("Masukkan jumlah penjualan earphone: ");
    jumlahPenjualan3 = sc.nextInt();
    System.out.println(" ");

    // menghitung keuntungan per item
    keuntungan1 = hargaJual1 - hargaBeli1 - biayaPengiriman1 - biayaPengemasan1 - diskon1;
    keuntungan2 = hargaJual2 - hargaBeli2 - biayaPengiriman2 - biayaPengemasan2 - diskon2;
    keuntungan3 = hargaJual3 - hargaBeli3 - biayaPengiriman3 - biayaPengemasan3 - diskon3;

    // menghitung jumlah item penghitung keuntungan
    jipk1 = jumlahPenjualan1 - (resiko1 / 100 * jumlahPenjualan1);
    jipk2 = jumlahPenjualan2 - (resiko2 / 100 * jumlahPenjualan2);
    jipk3 = jumlahPenjualan3 - (resiko3 / 100 * jumlahPenjualan3);

    // menghitung keuntungan produk
    keuntunganProduk1 = keuntungan1 * jipk1;
    keuntunganProduk2 = keuntungan2 * jipk2;
    keuntunganProduk3 = keuntungan3 * jipk3;

    float rataRata = (keuntunganProduk1 + keuntunganProduk2 + keuntunganProduk3) / (jipk1 + jipk2 + jipk3);
    float persentaseKeuntungan = (keuntunganProduk1 + keuntunganProduk2 + keuntunganProduk3) / targetKeuntungan;
    // output
    System.out
        .println(String.format("Keuntungan dari penjualan produk handphone adalah Rp. %,d", (int) keuntunganProduk1));
    System.out.println(String.format("Keuntungan dari penjualan produk kabel adalah Rp. %,d", (int) keuntunganProduk2));
    System.out
        .println(String.format("Keuntungan dari penjualan produk earphone adalah Rp. %,d", (int) keuntunganProduk3));
    System.out.println(String.format("total keuntungan dari penjualan semua produk adalah Rp. %,d",
        (int) keuntunganProduk1 + (int) keuntunganProduk3 + (int) keuntunganProduk3));
    System.out
        .println(String.format("Rata - rata keuntungan dari penjualan produk earphone adalah Rp. %,d", (int) rataRata));
    System.out.println(
        "Persentase keuntungan yang dicapai dari keuntungan yang diharapkan adalah " + persentaseKeuntungan + "%");
    sc.close();
  }
}

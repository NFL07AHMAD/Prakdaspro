import java.util.Scanner;

/**
 * Tugas
 */
public class Tugas {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int harga, dp, bulan, sisaHarga;
    float jumlahCicilan, bunga = 0.02f;

    System.out.println("Masukkan harga laptop");
    harga = sc.nextInt();
    System.out.println("Masukkan uang muka");
    dp = sc.nextInt();
    System.out.println("Masukkan jumlah bulan cicilan");
    bulan = sc.nextInt();

    sc.close();

    bulan = sc.nextInt();

    sc.close();

    sisaHarga = harga - dp;
    jumlahCicilan = sisaHarga / bulan + bunga * sisaHarga;
  }
}

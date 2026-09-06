import java.util.Scanner;

/**
 * Bank03
 */
public class Bank03 {

  public static void main(String[] args) {
    int jml_tabungan_awal, lama_menabung;
    double jml_tabungan_akhir, bunga, prosentase_bunga = 0.02;

    Scanner sc = new Scanner(System.in);
    System.out.println("masukkan jumlah tabungan awal anda:");
    jml_tabungan_awal = sc.nextInt();
    System.out.println("masukkan lama menabung anda:");
    lama_menabung = sc.nextInt();

    bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
    jml_tabungan_akhir = bunga + jml_tabungan_awal;

    System.out.println("Bunga adalah " + bunga);
    System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
    sc.close();
  }
}

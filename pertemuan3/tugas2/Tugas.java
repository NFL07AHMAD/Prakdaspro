import java.util.Scanner;

/**
 * Tugas
 */
public class Tugas {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int totalHarga, jmlLembar, biayaCetak = 500, biayaJilid = 5000;

    System.out.println("Masukkan jumlah lembar");
    jmlLembar = sc.nextInt();

    totalHarga = jmlLembar * biayaCetak + biayaJilid;
    System.out.println("Total harga adalah " + totalHarga);

    sc.close();
  }
}

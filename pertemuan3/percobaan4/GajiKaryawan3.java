import java.util.Scanner;

/**
 * GajiKaryawan3
 */
public class GajiKaryawan3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int gajiPokok;
    double bonus, totalGaji, tunjTrans = 600000, tunjMkn = 400000;

    System.out.println("Masukkan gaji pokok anda: ");
    gajiPokok = sc.nextInt();

    bonus = 0.05 * gajiPokok;
    totalGaji = gajiPokok + tunjMkn + tunjTrans + bonus - (gajiPokok * 0.1);

    System.out.println("Bonus anda adalah " + bonus);
    System.out.println("Total gaji anda adalah " + (int) totalGaji);

    sc.close();
  }
}

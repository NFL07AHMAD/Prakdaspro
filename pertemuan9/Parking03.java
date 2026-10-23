import java.util.Scanner;

/**
 * Parking03
 */
public class Parking03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int jenis, durasi, total = 0;

    do {
      System.out.print("Jenis kendaran : ");
      jenis = sc.nextInt();

      if (jenis == 1 || jenis == 2) {
        System.out.print("Masukkan durasi : ");
        durasi = sc.nextInt();
        if (jenis == 1) {
          total += durasi * 2000;
        } else {
          total += durasi * 3000;
        }
      }
    } while (jenis != 0);

    System.out.println("Total biaya parkir adalah " + total);
  }
}

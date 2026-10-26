import java.util.Scanner;

/**
 * Tugas203
 */
public class Tugas203 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai n = ");
    int n = sc.nextInt()
    int jumlahAngka = 0;
    int perkalian;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        perkalian = i * j;
        System.out.print(perkalian + " ");
        jumlahAngka += perkalian;
      }
      System.out.println();
    }
    System.out.println("Jumlah seluruh angka: " + jumlahAngka);
  }
}

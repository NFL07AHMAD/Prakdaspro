/**
 * Tugas103
 */
public class Tugas103 {

  public static void main(String[] args) {
    int totalAngka = 0;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j <= i) {
          System.out.print(j + " ");
          totalAngka++;
        }
      }
      System.out.println();
    }
    System.out.println("Total angka tercetak: " + totalAngka);
  }
}

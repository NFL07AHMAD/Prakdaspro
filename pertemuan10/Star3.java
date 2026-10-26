import java.util.Scanner;

/**
 * Star3
 */
public class Star3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan nilai n = ");
    int n = sc.nextInt();

    for (int i = 1; i < n; i++) {
      System.out.print(i);
    }
    System.out.println();
    sc.close()
  }
}

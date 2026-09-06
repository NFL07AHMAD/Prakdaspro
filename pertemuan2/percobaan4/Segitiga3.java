import java.util.Scanner;

/**
 * Segitiga3
 */
public class Segitiga3 {

  public static void main(String[] args) {
    int alas, tinggi;
    float luas;
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan alas: ");
    alas = sc.nextInt();
    System.out.println("Masukkan tinggi: ");
    tinggi = sc.nextInt();
    luas = alas * tinggi * 0.5f;
    System.out.println("Luas segitiga: " + luas);
    sc.close();
  }
}

import java.util.Scanner;

/**
 * MenghitungLuasPersegiPanjang03
 */
public class MenghitungLuasPersegiPanjang03 {

  public static void main(String[] args) {
    int panjang, lebar, luas;
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan nilai panjang: ");
    panjang = sc.nextInt();
    System.out.println("Masukkan nilai lebar");
    lebar = sc.nextInt();

    luas = panjang * lebar;
    System.out.println("Luas = " + luas);
    sc.close();
  }
}

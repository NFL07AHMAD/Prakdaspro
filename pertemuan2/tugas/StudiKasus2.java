import java.util.Scanner;

/**
 * StudiKasus2
 */
public class StudiKasus2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int lebar, panjang, diameter, panjangPersegi;

    System.out.println("Masukkan lebar");
    lebar = sc.nextInt();
    System.out.println("Masukkan panjang");
    panjang = sc.nextInt();
    System.out.println("Masukkan sisi persegi");
    panjangPersegi = sc.nextInt();
    System.out.println("Masukkan diameter");
    diameter = sc.nextInt();

    float luasLingkaran = 3.14f * diameter * 0.5f;
    int luasPersegi = panjangPersegi * panjangPersegi;
    int luasTanah = panjang * lebar;
    float luasSisa = luasTanah - (luasPersegi + luasLingkaran);

    System.out.println("Luas tanah yang tidak digunakan adalah " + luasSisa);

    sc.close();
  }
}

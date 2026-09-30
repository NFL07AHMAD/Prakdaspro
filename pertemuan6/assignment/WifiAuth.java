import java.util.Scanner;

/**
 * WifiAuth
 */
public class WifiAuth {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jabatan: ");
    String user = sc.next();
    int sks;
    if (user.equals("dosen")) {
      System.out.println("Akses WiFi diberikan (dosen)");
    } else if (user.equals("mahasiswa")) {
      sks = sc.nextInt();
      if (sks >= 12) {
        System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
      } else {
        System.out.println("Akses ditolak, SKS kurang dari 12");
      }
    } else {
      System.out.println("Akses ditolak");
    }

    sc.close();
  }
}

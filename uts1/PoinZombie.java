// Nama: Ahmad Naufal Febriansyah
// Kelas: TI - 1D
// Absen: 03
import java.util.Scanner;

/**
 */
public class PoinZombie {

  public static void main(String[] args) {
    String mode;
    int kill;
    int koinDasar = 0;
    double bonus = 0;
    int bonusTrofi = 0;
    double totalKoin;
    Scanner sc = new Scanner(System.in);

    System.out.print("Mode level (siang/malam): ");
    mode = sc.next();
    System.out.print("Jumlah kill zombie: ");
    kill = sc.nextInt();

    if (mode.equalsIgnoreCase("siang")) {
      koinDasar = 10 * kill; //perhitungan koin per kill
      if (kill <= 10 && kill >= 0) {
        bonus = 0;
      } else if (kill > 10 && kill <= 25) {
        bonus = 0.1;
      } else if (kill >= 26) {
        bonus = 0.25;
      } else {
        System.out.println("Jumlah kill harus lebih dari -1");
      }
    } else if (mode.equalsIgnoreCase("malam")){
      koinDasar = 15 * kill;
      if (kill <= 10 && kill > 0) {
        bonus = 0;
      } else if (kill > 10 && kill <= 25) {
        bonus = 0.15;
      } else if (kill >= 26 && kill <= 40) {
        bonus = 0.3;
      } else if (kill > 40){
        bonusTrofi = 100; //Penambahan 100 koin
      } else {
        System.out.println("Jumlah kill harus lebih dari -1");
      }
    } else {
      System.out.println("Mode harus siang atau malam");
    }

    totalKoin = koinDasar + (koinDasar*bonus) + bonusTrofi;

    System.out.println("Koin dasar : "+koinDasar);
    System.out.println("Bonus : "+(koinDasar*bonus)+bonusTrofi);
    System.out.println("Total Koin : "+totalKoin);
    sc.close();
  }
}

import java.util.Scanner;

public class StudiKasus103 {
  public static void main(String[] args) {
    int hargaPerCup = 1800;
    int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah cup: ");
    jumlahCup = sc.nextInt();
    System.out.print("Masukkan uang yang dibayarkan: ");
    uangBayar = sc.nextInt();

    totalHarga = jumlahCup * hargaPerCup;
    diskon = 0;

    if (totalHarga >= 100000) {
      diskon = totalHarga * 10/100;
    }

    totalBayar = totalHarga - diskon;

    System.out.println(String.format("Total harga adalah adalah Rp.%,d. Potongan harga sebesar Rp.%,d. Total yang harus dibayarkan adalah Rp.%,d.", totalHarga, diskon, totalBayar));

    if (uangBayar >= totalBayar) {
      kembalian = uangBayar - totalBayar;
      System.out.println(String.format("Jumlah kembalian Rp.%,d,", kembalian));
    } else {
      kurang = totalBayar - uangBayar;
      System.out.println(String.format("Uang tidak cukup, kurang Rp.%,d.", kurang));
    }

    sc.close();
  }
}

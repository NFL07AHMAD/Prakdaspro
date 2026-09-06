import java.util.Scanner;

public class StudiKasus1 {
  public static void main(String[] args) {
    int gajiPokok, tunjanganAnak, jumlahAnak;
    float simpananWajib = 0.1f;

    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan gaji pokok");
    gajiPokok = sc.nextInt();
    System.out.println("Masukkan tunjangan anak");
    tunjanganAnak = sc.nextInt();
    System.out.println("Masukkan jumlah anak");
    jumlahAnak = sc.nextInt();

    float gajiBersih = gajiPokok * simpananWajib + tunjanganAnak * jumlahAnak;

    System.out.println("Gaji bersih: " + gajiBersih);
    sc.close();
  }
}

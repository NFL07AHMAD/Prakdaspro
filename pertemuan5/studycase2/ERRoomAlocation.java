import java.util.Scanner;

/**
 * ERRoomAlocation
 */
public class ERRoomAlocation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah bed ICU: ");
    int sisaBedICU = sc.nextInt();
    System.out.print("Masukkan saturasi oksigen pasien: ");
    int $Sp0_2$ = sc.nextInt();
    System.out.print("Masukkan tekanan darah sistolik pasien: ");
    int bloodPressure = sc.nextInt();
    System.out.print("Masukkan temperatur tubuh pasien: ");
    int bodyTemp = sc.nextInt();
    System.out.print("Masukkan usia pasien: ");
    int age = sc.nextInt();
    System.out.print("Masukkan laju napas pasien: ");
    int respRate = sc.nextInt();
    System.out.print("Apakah pasien sepenuhnya sadar: ");
    boolean conscious = sc.nextBoolean();
    System.out.print("Apakah pasien memiliki riwayat komorbid: ");
    boolean comorbidities = sc.nextBoolean();

    if ($Sp0_2$ < 85 && sisaBedICU > 0) {
      System.out.println("ICU");
    } else if ($Sp0_2$ < 85 && sisaBedICU == 0) {
      System.out.println("UGD_VENTILATOR_MOIBIL");
    } else if (($Sp0_2$ >= 85 && $Sp0_2$ <= 89) || (bloodPressure < 90 || bloodPressure > 180) || !conscious) {
      System.out.println("RESUSITASI_UGD");
    } else if (($Sp0_2$ >= 90 && $Sp0_2$ <= 94) || bodyTemp > 39 && comorbidities && age >= 65) {
      System.out.println("HCU_ISOLASI");
    } else if (($Sp0_2$ >= 90 && $Sp0_2$ <= 94) || respRate > 24) {
      System.out.println("RAWAT_INAP_UMUM");
    } else {
      System.out.println("RAWAT_JALAN");
    }
    sc.close();
  }
}

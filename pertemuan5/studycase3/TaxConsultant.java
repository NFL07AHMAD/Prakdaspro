import java.util.Scanner;

/**
 * TaxConsultant
 */
public class TaxConsultant {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double lapisan1 = 0.05 * 60000000;
    double lapisan2 = lapisan1 + (250000000 - 60000000) * 0.15;
    double lapisan3 = lapisan1 + lapisan2 + (500000000 - 250000000) * 0.25;
    System.out.print("Masukkan penghasilan: ");
    float PKP = sc.nextInt();
    double pajak;
    if (PKP == 0) {
      pajak = 0;
    } else if (PKP > 0 && PKP <= 60000000) {
      pajak = PKP * 0.05;
    } else if (PKP > 60000000 && PKP <= 250000000) {
      pajak = lapisan1 + (PKP - 60000000) * 0.15;
    } else if (PKP > 250000000 && PKP <= 500000000) {
      pajak = lapisan2 + (PKP - 250000000) * 0.25;
    } else {
      pajak = lapisan3 + (PKP - 500000000) * 0.3;
    }
    sc.close();
    System.out.println(String.format("Pajak yang harus dibayarkan adalah Rp.%,d", (int) pajak));
  }
}

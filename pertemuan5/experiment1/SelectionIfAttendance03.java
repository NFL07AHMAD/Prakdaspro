import java.util.Scanner;

public class SelectionIfAttendace03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- PRINT KRS SIAKAD ---");
    System.out.print("Has the UKT been paid? (true/false): ");
    boolean uktPaid = sc.nextBoolean();

    if (uktPaid) {
      System.out.println("UKT Payment verified");
      System.out.println("Please print your KRS and ask your DPA to sign it");
      sc.close();
    } else { // Question number 4
      System.out.println("Registration rejected. Please pay your UKT first");
    }
  }
}

import java.util.Scanner;

/**
 * AssignmentQueueAttendance03
 */
public class AssignmentQueueAttendance03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- Digital Queue System ---");
    System.out.println("Service Code:\n1: Certification Legalization\n2: SKAK\n3: UKT Payment\n4: Academic Vacation Request");
    System.out.print("Insert Code: ");

    int code = sc.nextInt();

    switch (code) {
      case 1:
        System.out.println("Certification Legalization at Locet A");
        break;
      case 2:
        System.out.println("SKAK at Locet B");
        break;
      case 3:
        System.out.println("UKT Payment at Locet C");
        break;
      case 4:
        System.out.println("Academic Vacation Request at Locet D");
        break;

      default:
        System.out.println("Wrong code!");
        break;
    }
  }
}

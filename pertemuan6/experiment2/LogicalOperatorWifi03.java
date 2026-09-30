import java.util.Scanner;

/**
 * LogicalOperatorWifi03
 */
public class LogicalOperatorWifi03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean isStudent, isLecturer, isBlocked;

    System.out.print("Is the user a student? (true/false): ");
    isStudent = sc.nextBoolean();
    System.out.print("Is the user a lecturer? (true/false): ");
    isLecturer = sc.nextBoolean();
    System.out.print("Is the account currently blocked (tre/false): ");
    isBlocked = sc.nextBoolean();

    if ((isStudent || isLecturer) && !isBlocked) {
      System.out.println("WiFi access granted");
    } else {
      System.out.println("WiFi access denied");
    }

    sc.close();
  }
}

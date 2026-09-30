import java.util.Scanner;

/**
 * NestedLabAccess03
 */
public class NestedLabAccess03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean isActiveStudent, isSanctioned, hasLecturerPermit, isLabAssistant;
    System.out.print("Is Active Student? (true/false): ");
    isActiveStudent = sc.nextBoolean();
    System.out.print("Is sanctioned? (true/false): ");
    isSanctioned = sc.nextBoolean();
    System.out.print("Has lecturer permit? (true/false): ");
    hasLecturerPermit = sc.nextBoolean();
    System.out.print("Is lab assistant? (true/false): ");
    isLabAssistant = sc.nextBoolean();
  
    if (isActiveStudent && !isSanctioned) {
      if (hasLecturerPermit || isLabAssistant) {
        System.out.println("Laboratory access granted");
      } else {
        System.out.println("Access denied: lecturer permission or la lab assisteant status is required");
      }
    } else {
      System.out.println("Access denied: student status does not meet the requirement");
    }
  }
}

import java.util.Scanner;

/**
 * SelectionIfElseAttendance03
 */
public class SelectionIfElseAttendance03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- PRINT KRS SIAKAD ---");
    System.out.print("Enter you current semester: ");
    int semester = sc.nextInt();

    if (semester == 1) {
      System.out.println("KRS for semester 1 is displayed");
    } else if (semester == 2) {
      System.out.println("KRS for semester 2 is displayed");
    } else if (semester == 3) {
      System.out.println("KRS for semester 3 is displayed");
    } else if (semester == 4) {
      System.out.println("KRS for semester 4 is displayed");
    } else if (semester == 5) {
      System.out.println("KRS for semester 5 is displayed");
    } else if (semester == 6) {
      System.out.println("KRS for semester 6 is displayed");
    } else if (semester == 7) {
      System.out.println("KRS for semester 7 is displayed");
    } else if (semester == 8) {
      System.out.println("KRS for semester 8 is displayed");
    } else {
      System.out.println("Invalid semester");
    }
    sc.close();
  }
}

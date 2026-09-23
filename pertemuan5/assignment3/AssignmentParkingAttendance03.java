import java.util.Scanner;

/**
 * AssignmentParkingAttendance03
 */
public class AssignmentParkingAttendance03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Parking Sistem ---");
    System.out.print("Insert parking duration (Hour): ");
    int jam = sc.nextInt();
    int rate;
    if (jam > 2) {
      rate = 2000 + ((jam-2) * 1000);
    } else {
      rate = 2000;
    }
    System.out.println("Your total parking rate is "+rate);
    sc.close();
  }
}

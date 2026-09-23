import java.util.Scanner;

/**
 * Assignment2SelectionAttendance03
 */
public class Assignment2SelectionAttendance03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    System.out.println("--- PRINT KRS SIAKAD ---");
    System.out.print("Insert your total credits: ");
    int totalCredits = sc.nextInt();

    if (totalCredits > 24) {
      System.out.println("Exceeds the limit");
    } else {
      System.out.println("KRS is valid");
    }
    sc.close();
  }
}

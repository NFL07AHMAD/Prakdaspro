import java.util.Scanner;

/**
 * Task2AssistantSelection03
 */
public class Task2AssistantSelection03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean isActive, isSanction;
    int basicProgrammingGrade, interviewScore;
    String status;

    System.out.print("Is student active?: ");
    isActive = sc.nextBoolean();
    System.out.print("Is student is sanctioned?: ");
    isSanction = sc.nextBoolean();
    System.out.println("How much student's grade in basic programming?: ");
    basicProgrammingGrade = sc.nextInt();
    System.out.println("How much student scored in interview?: ");
    interviewScore = sc.nextInt();

    if (isActive && !isSanction) {
      if (basicProgrammingGrade >= 80) {
        if (interviewScore >= 75) {
          status = "Student is selected";
        } else {
          status = "Student is not selected because doesn't pass the interview";
        }
      } else {
        status = "Student is not selected because doesn't meet the minimum grade of basic programming";
      }
    } else {
      status = "Student is not selected because is not active or under academic sanction";
    }
    System.out.println(status);
    sc.close();
  }
}

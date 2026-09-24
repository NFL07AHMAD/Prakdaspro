import java.util.Scanner;

/**
 * NusantaraPay
 */
public class NusantaraPay {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String accountStat;
    int balance, time, transactionAmount;
    boolean isBedaNegara;

    System.out.print("Enter your account status: ");
    accountStat = sc.next();
    System.out.print("Enter your account balance: ");
    balance = sc.nextInt();
    System.out.print("Enter your current time: ");
    time = sc.nextInt();
    System.out.print("Enter transaction amount: ");
    transactionAmount = sc.nextInt();
    System.out.println("Is the transaction in the different country: ");
    isBedaNegara = sc.nextBoolean();

    if (accountStat == "BLACK-LISTED") {
      System.out.println("REJECTED_BLACKLIST");
    } else if(transactionAmount > balance) {
      System.out.println("REJECTED_SALDO");
    } else if (isBedaNegara && transactionAmount > 2000) {
      System.out.println("FLAGGED_FRAUD");
    } else if (time >= 0000 && time <= 0400 && transactionAmount > 1000) {
      System.out.println("REQUIRE_OTP_NIGHT");
    } else if (accountStat == "SUSPICIOUS" && transactionAmount > 500) {
      System.out.println("REQUIRE_OTP_SUSPICIOUS");
    } else if (transactionAmount > 10000) {
      System.out.println("REJECTED_LIMIT");
    } else {
      System.out.println("APROVED");
    }
  }
}

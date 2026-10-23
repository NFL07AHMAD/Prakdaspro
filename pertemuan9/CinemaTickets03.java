import java.util.Scanner;

/**
 * CinemaTickets03
 */
public class CinemaTickets03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int price = 50000;
    int revenue = 0;
    int clientTickets;
    int ticketsTotal;
    String isContinue;
    while (true) {
      clientTickets = 0;

      System.out.print("How much customer buy? : ");
      clientTickets = sc.nextInt();

      if (clientTickets < 0) {
        continue;
      } else {
        if (clientTickets >= 4 && clientTickets < 10) {
          revenue += (clientTickets * price) - ((clientTickets * price) * 0.1);
        } else if (clientTickets >= 10) {
          revenue += (clientTickets * price) - ((clientTickets * price) * 0.15);
        } else {
          revenue += (clientTickets * price);
        }

        System.out.println(String.format("Total revenue is Rp. %,d", revenue));
        System.out.print("continue? (y/n) : ");
        isContinue = sc.next();
        if (isContinue.equalsIgnoreCase("n")) {
          break;
        }
        sc.nextLine();
      }
    }
  }
}

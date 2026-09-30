import java.util.Scanner;

/**
 * BookDiscount03
 */
public class BookDiscount03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int discount = 0; 
    String book;
    int amount;

    System.out.print("What do you want to buy?: ");
    book = sc.next();

    System.out.print("How much do you want to buy: ");
    amount = sc.nextInt();

    if (book.equalsIgnoreCase("dictionary")) {
      discount = 10;
      if (amount > 2) {
        discount += 0.02;
      }
    } else if (book.equalsIgnoreCase("novel")) {
      discount = 7;
      if (amount > 3) {
        discount += 3;
      } else {
        discount += 0.01;
      }
    } else {
      if (amount > 3) {
        discount = 5;
      }
    }
    sc.close();
    System.out.println(String.format("Your total discount is %d%%",  discount));
  }
}

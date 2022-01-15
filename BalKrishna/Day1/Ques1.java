import java.util.Scanner;

/**
 * Question 1. Input a year and find whether it is a leap year or not.
 */
public class Ques1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read input from user
    System.out.println("Give a year:");
    int year = Integer.valueOf(scanner.nextLine());

    /**
     * A year is leap year if
     * 1.It is divisible by 4
     * 2.It is divisible by 400 and not divisible by 100.
     */

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println("This year is a leap year.");
    } else {
      System.out.println("This year is not a leap year.");
    }

    scanner.close();
  }
}
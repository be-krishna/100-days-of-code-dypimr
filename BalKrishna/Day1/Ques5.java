import java.util.Scanner;

/**
 * Question 5. Keep taking numbers as inputs till the user enters ‘x’, after
 * that print sum of all.
 */

public class Ques5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int sumOfNumbers = 0;

    // Start an infinite loop and read user input.
    while (true) {
      System.out.println("Enter a number or x to stop:");
      String number = scanner.nextLine();

      // If user input is 'x' then break out of loop

      if (number.equals("x")) {
        break;
      }

      // Else keep adding the inputs
      sumOfNumbers += Integer.valueOf(number);
    }

    // Print the sum of all inputs.
    System.out.println("Sum of numbers : " + sumOfNumbers);

    scanner.close();
  }
}

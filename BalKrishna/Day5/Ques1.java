
import java.util.Scanner;

/**
 * Question 1. Write a program that prompts the user to input an integer and
 * then outputs the number with the digits reversed. For example, if the input
 * is 12345, the output should be 54321.
 */
public class Ques1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int number = Integer.valueOf(scanner.nextLine());
    // say number = 123

    int reverse = 0;

    while (number != 0) {
      // divide by 10 and get the last digit as remainder
      int remainder = number % 10;
      // loop 1: remainder = 3 i.e. ( 123 % 10 )
      // loop 2: remainder = 2 i.e. ( 12 % 10 )
      // loop 3: remainder = 1 i.e. ( 1 % 10 )

      // for each place, multiply the value by 10 and add the remainder
      reverse = reverse * 10 + remainder;
      // loop 1: 0 * 10 + 3 = 3
      // loop 2: 3 * 10 + 2 = 32
      // loop 3: 32 * 10 + 1 = 321

      // divide the number by 10 to eiliminate a digit
      number /= 10; // same as number = number / 10
      // loop 1: 123 / 10 = 12
      // loop 2: 12 / 10 = 1
      // loop 3: 1 / 10 = 0 i.e loop break here

    }

    // value of reverse = 321
    System.out.println("Reverse of the number: " + reverse);
    scanner.close();

  }
}
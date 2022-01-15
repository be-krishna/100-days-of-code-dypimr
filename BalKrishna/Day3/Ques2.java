
import java.util.Scanner;

/**
 * Question 3: Write a program that prompts the user for a number between one
 * and
 * one hundred, and prints that number. If the number is divisible by three,
 * then print "Fizz" instead of the number. If the number is divisible by five,
 * then print "Buzz" instead of the number. If the number is divisible by both
 * three and five, then print "FizzBuzz" instead of the number.
 */

public class Ques2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read input from user
    int number = Integer.valueOf(scanner.nextLine());

    // The trick is to use conditionals in proper order. If you change the order of
    // the if statements your output changes
    if (number % 3 == 0 && number % 5 == 0) {
      System.out.println("FizzBuzz");
    } else if (number % 3 == 0) {
      System.out.println("Fizz");
    } else if (number % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(number);
    }

    scanner.close();
  }
}

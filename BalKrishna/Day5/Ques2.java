
import java.util.Scanner;

/**
 * Question 2: Write a program to print Fibonacci series of n terms where n is
 * input by user :
 */

public class Ques2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the no of terms: ");

    int terms = Integer.valueOf(scanner.nextLine());

    int first = 0, second = 1, next = 0;

    System.out.println("Fibonacci:");
    while (terms-- > 0) {
      System.out.println(next);
      first = second;
      second = next;
      next = first + second;
    }
    scanner.close();
  }
}

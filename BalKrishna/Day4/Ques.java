
import java.util.Scanner;

/**
 * Part 1: Implement a program that asks the user for numbers (the program first
 * writes -1, the program prints "Thx! Bye!" and ends.
 * 
 * Part 2: Extend the program so that it prints the sum of the numbers (not
 * including the -1) the user has written.
 * 
 * Part 3: Extend the program so that it also prints the number of numbers (not
 * including the -1) the user has written.
 * 
 * Part 4: Extend the program so that it prints the mean of the numbers (not
 * including the -1) the user has written.
 * 
 * Part 5: Extend the program so that it prints the number of even and odd
 * numbers (excluding the -1).
 */

public class Ques {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Give numbers:");

    int sumOfNumbers = 0;
    int numberCount = 0;
    int evenCount = 0;
    int oddCount = 0;

    while (true) {
      int input = Integer.valueOf(scanner.nextLine());

      // Solution to part 1
      if (input == -1) {
        System.out.println("Thx! Bye!");
        break;
      }

      // Solution to part 5
      if (input % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }

      // Solution to part 3
      numberCount++;

      // Solution to part 2
      sumOfNumbers += input;
    }
    System.out.println("Sum: " + sumOfNumbers);
    System.out.println("Numbers: " + numberCount);

    // Solutions to part 4
    double average = (double) sumOfNumbers / numberCount;

    System.out.println("Average: " + average);
    System.out.println("Even: " + evenCount);
    System.out.println("Odd: " + oddCount);

    scanner.close();
  }
}

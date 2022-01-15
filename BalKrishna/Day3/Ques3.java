
import java.util.Scanner;

/**
 * Question 3: Write a program that reads values from the user until they input
 * a
 * 0. After this, the program prints the total number of inputted values. The
 * zero that's used to exit the loop should not be included in the total number
 * count.
 */

public class Ques3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Counter variable to keep track of no. of numbers entered
    int inputCount = 0;

    // Looping infinitely
    while (true) {
      System.out.println("Give a number:");

      // Read input from user
      int input = Integer.valueOf(scanner.nextLine());

      // Break out of loop according to the condition specified
      if (input == 0) {
        break;
      }

      // increase the counter by 1
      // alternatively, inputCount += 1; can be used or inputCount++;
      inputCount = inputCount + 1;
    }

    // Out of the loop and print the value of the counter variable
    System.out.println("Number of numbers: " + inputCount);

    scanner.close();
  }
}

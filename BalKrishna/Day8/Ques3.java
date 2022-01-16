
import java.util.Scanner;

/**
 * Question 3: Print Equilateral Triangle Star Pattern in java.
 * 
 * The pattern like:
 * 
 * ----*
 * ---* *
 * --* * *
 * -* * * *
 */

public class Ques3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter no of rows: ");
    int rows = scanner.nextInt();

    // For rows
    for (int i = 0; i < rows; i++) {
      /**
       * For Spaces
       * Pass 1: rows - i = 5-0 = 5
       * Output
       * -----
       * Pass 2: rows - i = 5-1 = 4
       * Output
       * ----
       * Pass 2: rows - i = 5-2 = 3
       * Output
       * ---
       * ... so on
       */
      for (int j = rows - i; j > 1; j--) {
        System.out.print(" ");
      }

      /**
       * For Characters
       * Pass 1:
       * Output
       * -----*
       * Pass 2:
       * Output
       * -----*
       * ----* *
       * ---* * *
       * 
       * ... so on
       */
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

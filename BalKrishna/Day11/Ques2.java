import java.util.Arrays;
import java.util.Collections;

/**
 * Question 2: Write a program to find the maximum and minimum value of an
 * array.
 */

public class Ques2 {
  public static void main(String[] args) {

    Integer[] array = { 10, 20, 30, 40, 50, 60, 70 };

    System.out.print("The array is: ");
    for (int i : array) {
      System.out.print(i + " ");
    }

    System.out.println();

    int max = Collections.max(Arrays.asList(array));
    int min = Collections.min(Arrays.asList(array));

    System.out.println("Maximum of array: " + max);
    System.out.println("Minimum of array: " + min);

  }
}

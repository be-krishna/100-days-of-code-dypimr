import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Questions 4: Write a Java program to find the duplicate values of an array of
 * string values.
 */

public class Ques4 {
  public static void main(String[] args) {

    String[] array = { "a", "b", "c", "d", "a", "e", "e" };

    System.out.print("The array is: ");
    for (String i : array) {
      System.out.print(i + " ");
    }

    System.out.println();

    ArrayList<String> duplicates = new ArrayList<>();

    for (String i : array) {
      int val = Collections.frequency(Arrays.asList(array), i);
      if (val > 1) {
        if (duplicates.contains(i)) {
          continue;
        }
        duplicates.add(i);
      }
    }

    System.out.println("Array has duplicates of following:");

    for (String i : duplicates) {
      System.out.println(i);
    }

  }
}

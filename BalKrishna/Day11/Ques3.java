import java.util.Arrays;
import java.util.Collections;

public class Ques3 {
  public static void main(String[] args) {
    Integer[] array = { 10, 20, 30, 40, 50, 60, 70 };

    System.out.print("The array is: ");
    for (int i : array) {
      System.out.print(i + " ");
    }

    System.out.println();

    Collections.reverse(Arrays.asList(array));

    System.out.println();

    System.out.print("The array is: ");
    for (int i : array) {
      System.out.print(i + " ");
    }

    System.out.println();
  }
}

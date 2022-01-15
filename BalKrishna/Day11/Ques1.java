import java.util.Scanner;

/**
 * Question 1: Write a Java program to find the index of an array element.
 */

/**
 * Ques1
 */
public class Ques1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] array = { 10, 20, 30, 40, 50, 60, 70 };

    System.out.print("The array is: ");
    for (int i : array) {
      System.out.print(i + " ");
    }

    System.out.println();

    System.out.print("Enter value to find the index of: ");
    int value = Integer.valueOf(scanner.nextLine());

    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        System.out.println(String.format("Index of %d is %d", value, i));
        return;
      }
    }

    System.out.println("Value not found!");

    scanner.close();
  }

}
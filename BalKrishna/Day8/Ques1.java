
import java.util.Scanner;

/**
 * Question 1: Print hollow square box using inputed chars and size.
 * Ex:
 * Enter character: #
 * Enter size: 5
 * '-' represents spaces
 * # # # # #
 * #-------#
 * #-------#
 * #-------#
 * # # # # #
 */
public class Ques1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter character to be printed:");
    String character = scanner.nextLine();
    System.out.println("Enter square size:");
    int size = scanner.nextInt();

    for (int i = 0; i < size; i++) {
      if (i == 0 || i == (size - 1)) {
        for (int j = 0; j < size; j++) {
          System.out.print(character + " ");
        }
        System.out.println();
        continue;
      }
      String mid = " ".repeat(size * 2 - 3);
      System.out.println(character + mid + character);
    }
  }
}
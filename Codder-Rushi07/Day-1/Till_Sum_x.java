import java.util.Scanner;

public class Sum
 {
  public static void main(String[] args) 
  {

    Scanner scanner = new Scanner(System.in);

    int sum = 0;

    while (true) {
      System.out.println("Enter a number or x to stop:");
      String number = scanner.nextLine();


      if (number.equals("x")) {
        break;
      }

      sum += Integer.valueOf(number);
    }

    System.out.println("Sum of numbers : " + sum);

    scanner.close();
  }
}

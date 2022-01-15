import java.util.Scanner;

/**
 * Question 1: Write a program to print whether a number is even or odd, also
 * take input.
 */
public class Ques1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read input from user
    System.out.println("Please enter a number: ");

    int number = Integer.valueOf(scanner.nextLine());

    // if the number is fully divisible by 2 i.e. it does not leaves a remainder,
    // then it is a even number
    if (number % 2 == 0) {
      System.out.println(number + " is even.");
    } else {
      System.out.println(number + " is odd.");
    }

    scanner.close();
  }
}
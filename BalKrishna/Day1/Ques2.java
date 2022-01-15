import java.util.Scanner;

/**
 * Question 2. Take two numbers and print the sum of both.
 * 
 */

public class Ques2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Reading user inputs

    System.out.println("Enter first number:");
    int first_number = Integer.valueOf(scanner.nextLine());

    System.out.println("Enter second number:");
    int second_number = Integer.valueOf(scanner.nextLine());

    // Adding the inputs and storing it in third variable.

    int sum = first_number + second_number;

    System.out.println("The sum of numbers is " + sum);

    scanner.close();

  }

}

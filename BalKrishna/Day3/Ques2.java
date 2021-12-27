package BalKrishna.Day3;

import java.util.Scanner;

public class Ques2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = Integer.valueOf(scanner.nextLine());

    if (number % 3 == 0 && number % 5 == 0) {
      System.out.println("FizzBuzz");
    } else if (number % 3 == 0) {
      System.out.println("Fizz");
    } else if (number % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(number);
    }

    scanner.close();
  }
}

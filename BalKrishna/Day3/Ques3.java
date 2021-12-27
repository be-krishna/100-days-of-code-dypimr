package BalKrishna.Day3;

import java.util.Scanner;

public class Ques3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int inputCount = 0;

    while (true) {
      System.out.println("Give a number:");
      int input = Integer.valueOf(scanner.nextLine());

      if (input == 0) {
        break;
      }

      inputCount = inputCount + 1;
    }

    System.out.println("Number of numbers: " + inputCount);

    scanner.close();
  }
}

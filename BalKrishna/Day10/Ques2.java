package BalKrishna.Day10;

/**
 * Question 2:
 * your Array looks like this :- [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] //
 * output: The sum is 55
 */

public class Ques2 {
  public static void main(String[] args) {
    int[] array = new int[] { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

    int sum = 0;

    for (int i : array) {
      sum += i;
    }

    System.out.println("The sum is " + sum);
  }
}

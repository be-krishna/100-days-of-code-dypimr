
public class Ques3 {
  public static void main(String[] args) {
    int[] array = new int[] { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

    int sum = 0;

    for (int i : array) {
      sum += i;
    }

    System.out.println("Average value of the array elements is " + (sum / array.length));
  }
}

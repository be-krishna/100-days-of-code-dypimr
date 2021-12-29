import java.util.Scanner;

public class Fibonacci
 {
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter the no of terms: ");

    int n = sc.nextInt();

    int f = 2, s = 1, l = 3;

    System.out.println("Fibonacci:");
    for(int i=0;i<n;i++) 
    {
      System.out.println(l);
      f = s;
      s = l;
      l = f + s;
     
    }

  }
}

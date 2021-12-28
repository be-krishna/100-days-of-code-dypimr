import java.util.Scanner;

public class SumNum 
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Give a numbers:");
    int cn = 0;

    while (true) 
    {
      //System.out.println("Give a number:");
      int i = sc.nextInt();

      if (i == -1)
      {
        break;
      }

      cn = cn+i;
    }
    
    System.out.println("Thanks! Bye.. ");

    System.out.println("Sum :"+cn);

  }
}

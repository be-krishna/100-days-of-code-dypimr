import java.util.Scanner;

public class Num
{
  public static void main(String[] args)
  {    
    Scanner sc = new Scanner(System.in);
    System.out.println("Give a numbers:");
    int cn = 0, nm = 0;
    while (true) 
    {
      int i = sc.nextInt();
      if (i == -1)
      {
        break;
      }
      cn = cn+i;
      nm = nm+1;
    } 
    System.out.println("Thanks! Bye..");
    System.out.println("Sum :"+cn);
    System.out.println("Numbers :"+nm);
    
  }
}

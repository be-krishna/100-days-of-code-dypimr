
import java.util.*;
class Triangle
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter The Number");
    int value=sc.nextInt();
    int m,n;
    for(m=1;m<=value;m++)
    {
      for(n=1;n<=m;n++)
      System.out.print(n);
      System.out.print("\n");
    }
    
  }
}

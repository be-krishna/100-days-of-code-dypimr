import java.util.*;

public class sum{
  public static void main(String args[])
  {
    int sum=0;
    int x=0;
    Scanner scan= new Scanner(System.in);
    do
    {
      System.out.println("enter the number" +x);
      x=scan.nextInt();
      sum=sum+x;
    }
    
    while(x!=0);{
      System.out.println("the sum is" +sum);
    }
    
  }
  
}

 

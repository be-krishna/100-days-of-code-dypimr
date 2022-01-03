import java.util.*;
/* Hollow Square Star Pattern in java. */

public class Q2
{
  public static void main(String args[]) 
  {
     Scanner sc =new Scanner(System.in);
     System.out.print("Enter square length ");
     int n=sc.nextInt();
     System.out.println(); 
      for(int i=0;i<n;i++)
      {
        
          for(int j=0;j<n;j++)
          {
               
              if(i==0 || i==n-1 || j==0 || j==n-1)
              {
              System.out.print("*  ");
              }
             
              else
              System.out.print("   ");
          }
          System.out.println();
      }
  }
} 

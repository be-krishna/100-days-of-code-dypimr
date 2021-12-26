import java.util.*;
import java.util.Scanner;
class EvenOdd
{  
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a No. ");  
    int n=sc.nextInt();
    
    if(n%2==0)
    {
      System.out.println(n+" IS a Even No.");
    }
    System.out.println(n+" IS a Odd No.");
    
  }  
}  

import java.util.*;

 /* Write a Java program that reads an
 integer and check whether it is negative,
 zero, or positive. */
 
 class CheckNum
 {
   public static void main(String args[])
   {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int num=sc.nextInt();
    
    if(num>0)
    {
      System.out.println("Given no is Positive");
    }
    else if(num<0)
    {
      System.out.println("Given no is Negative"); 
    }
    else
    System.out.println("Given no is zero");
   }
 }

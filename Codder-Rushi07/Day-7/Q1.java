import java.util.*;

 /* Write a program in Java to display
  the pattern like right angle triangle
   with a number. */

 class Q1
 {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Number: ");
    int num=sc.nextInt();
    int i, j;
    for(i=1;i<=num;i++)
    {
      for(j=1;j<=i;j++)
      
        System.out.print(j);
        System.out.println("");   
        
    }
   }
 }

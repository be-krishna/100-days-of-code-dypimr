
import java.util.*;
/* 2.Write a program in Java to make
 such a pattern like right angle
  triangle with a number which will
   repeat a number in a row. */
   
 class Q2
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
      
       System.out.print(i);
       System.out.println("");
    }
     
   }
 }

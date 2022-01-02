
import java.util.*;

/*Write a program in Java to make such 
a pattern like right angle triangle with
 number increased by 1. */
   
 class Q3
 {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Number: ");
    int num=sc.nextInt();
    int i, j, next=1;
    for(i=1;i<=num;i++)
    {
      for(j=1;j<=i;j++)
      
       System.out.print(next+++" ");
       
       System.out.println("");
       
    }
     
   }
 }

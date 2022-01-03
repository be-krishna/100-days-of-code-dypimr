import java.util.*;

 /*.Right angle Triangle Star Pattern
  in java.*/

 class Q2
 {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Row no: ");
    int num=sc.nextInt();
    int i, j;
    for(i=1;i<=num;i++)
    {
      for(j=1;j<=i;j++)
      
        System.out.print(" * ");
        System.out.println("");   
        
    }
   }
 }

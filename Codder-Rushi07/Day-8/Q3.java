import java.util.*;

 /*.Equilateral Triangle Star Pattern
  in java.*/

 class Q3
 {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Row no: ");
    int n=sc.nextInt();
    int i, j, k;
    for(i=1;i<=n;i++)
    {
      
      for(j=i;j<=n;j++)
      System.out.print(" ");
      
      {
        for(k=0;k<i;k++)
        System.out.print("* ");
        //System.out.println("");   
      }
        System.out.println();
    }
   }
 }

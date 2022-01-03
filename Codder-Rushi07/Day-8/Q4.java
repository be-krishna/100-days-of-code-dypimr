import java.util.*;

 class ChessNum
 {
   public static void main(String args[])
   { 
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the Length ");
     int n=sc.nextInt();
     
     int i, j, k=1;
     for(i=1;i<=n;i++) 
     {
       for(j=1;j<=n;j++)
       {
         if(k==1)
         {
           System.out.print(1);
         }
         else 
         {
           System.out.print(0);
         }
         k*=-1;
       }
      if(n%2==0)
      {
        k*=-1;
      }
       System.out.println();
     }
   }
 }

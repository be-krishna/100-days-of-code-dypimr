import java.util.*;

 class triangle
 {
   public static void main(String args[])
   { 
     System.out.println("Enter the Number");
     Scanner sc= new Scanner (System.in);
     int m,n;
      int num = sc.nextInt();
      
      for(m=1;m<=num;m++)
      {
        for(n=1;n<=m;n++)
        System.out.print(m);
        System.out.println("");
      }
}
}

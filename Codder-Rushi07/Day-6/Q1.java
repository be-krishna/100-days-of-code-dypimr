import java.util.*;

 /* Take three numbers from the user and 
 print the greatest number? */
   
 class GreaterNum
 {
   public static void main(String args[])
   { 
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the First No:");
     int n1=sc.nextInt();
     System.out.println("Enter the Second No:");
     int n2=sc.nextInt();
     System.out.println("Enter the Third No:");
     int n3=sc.nextInt();
     
     int x=n1>n2?n1:n2;
     int res=n3>x?n3:x;
     System.out.println("greatest no is "+res);
   }
 }

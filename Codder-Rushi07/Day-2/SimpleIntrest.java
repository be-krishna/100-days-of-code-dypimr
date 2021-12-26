import java.util.*;
import java.util.Scanner;
 // Compiler version JDK 11.0.2

 class Simple
 {
   public static void main(String args[])
   {
     
     Scanner sc =new Scanner (System.in);
    System.out.println("principle : ");
    int p=sc.nextInt();
    
    System.out.println("Rate : ");
    double r=sc.nextDouble();
    
    System.out.println("Time : ");
    int t=sc.nextInt();
    
    double amt=(p*r*t)/100;
    System.out.println("simple interest: "+amt);
    
   }
 }

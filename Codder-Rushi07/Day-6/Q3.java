import java.util.*;

 /* Write a Java program that takes a number
  from the user between 1 and 7 and displays
   the name of the weekday. */

 class Weekday
 {
   public static void main(String args[])
   { 
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the No Between 1-7:");
     int n=sc.nextInt();
     
     switch(n)
     {
       case 1:
       System.out.println("monday");
       break;
       case 2:
       System.out.println("Tuesday");
       break;
       case 3:
       System.out.println("Wednesday");
       break;
       case 4:
       System.out.println("Thursday");
       break ;
       case 5:
       System.out.println("Friday");
       break;
       case 6:
       System.out.println("Saturday");
       break;
       case 7:
       System.out.println("Sunday");
       break ;
     }
     System.out.println("Enter valid No. Between 1-7....");
   }
 }

import java.util.*;

 public class Points
 {
   public static void main(String args[])
   { 
     Scanner sc = new Scanner(System.in);

    System.out.println("Give points [0-100]:");
    double p = sc.nextDouble();

    if (p < 0) {
      System.out.println("impossible!");
    } else if (p <= 49) {
      System.out.println("failed");
    } else if (p <= 59) {
      System.out.println("1");
    } else if (p <= 69) {
      System.out.println("2");
    } else if (p <= 79) {
      System.out.println("3");
    } else if (p <= 89) {
      System.out.println("4");
    } else if (p <= 100) {
      System.out.println("5");
    } else {
      System.out.println("incredible!");
    }
    
   }
 }

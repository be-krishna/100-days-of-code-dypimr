import java.util.Scanner;
public class revstring
 {
public static void main(String[] args) {
     int num=0;
      int reversenum =0;
      System.out.println("Input a num: ");
    
      Scanner sc = new Scanner(System.in);
    
      num = sc.nextInt();
    
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse number is: "+reversenum);
   
}    
}

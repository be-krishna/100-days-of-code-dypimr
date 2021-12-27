import java.util.Scanner;

public class SumTill_X {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int sum = 0;
       while(true) {
    	   System.out.println("Enter a number or x:");
    	   String num = sc.nextLine();
    	   
    	   if(num == ("x")) {
    		   break;
    	   }
    	   
    	   sum = sum + Integer.valueOf(num);
       }
       
       System.out.println("Sum of Given Numbers:" + sum);
       sc.close();
	}
}

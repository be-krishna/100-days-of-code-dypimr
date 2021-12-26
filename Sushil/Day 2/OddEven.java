import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// I First Started with Entering the UserInput.
    // Then here i tried if else conditional statment and make it as simple as possible
		    Scanner s = new Scanner(System.in);
	      System.out.println("Enter Number:"); 

	      int number = s.nextInt();
           if(number % 2 == 0){
             System.out.println("Even");
           } else {
             System.out.println("Odd");
           }
      }
}

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);  // here we made and UserInput Interger
      System.out.println("Enter Number:"); 

      int number = sc.nextInt();
      for(int i=1 ;i<=10; i++) {
        // In this For Loop we start with 1 upto 10 and multiply it with the number UserInput while Running the Code
    	  System.out.println(number +" * " + i + " = " + number *i);
      }
	}

}

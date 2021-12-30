/*Take three numbers from the user and print the greatest number? */

package Day_6;

import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int firstNumber ,secondNumber, thirdNumber ;
		System.out.println("Enter the first number  :");
		firstNumber = sc.nextInt();
		
		System.out.println("Enter the second number  :");
		secondNumber = sc.nextInt();
		
		System.out.println("Enter the third number  :");
		thirdNumber = sc.nextInt();
		
		if(firstNumber >= secondNumber &&  firstNumber >= thirdNumber ) {
			System.out.println(firstNumber + " is the largest Number");
		}else if(secondNumber >= thirdNumber &&  secondNumber >= firstNumber) {
			System.out.println(secondNumber + " is the largest Number");
		}else {
			System.out.println(thirdNumber + " is the largest Number");
		}
		sc.close();
	}

}

/*Write a program that prompts the user for a number between one and one hundred, and prints that number. If the number is divisible by three, then print "Fizz" instead of the number. If the number is divisible by five, then print "Buzz" instead of the number. If the number is divisible by both three and five, then print "FizzBuzz" instead of the number. */


package Day_3;

import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number [ 0 - 100] :");
		int number = sc.nextInt(); // User Input
		
    // here we use If else if Statment
    
		if(number>100) {
			
			System.out.println("You Exceed the value of Input");
			
		}else if(number%3==0 && number%5==0){
    
			System.out.println("FizzBuzz");   
			
		}else if(number%5==0) {
			
			System.out.println("Buzz");
			
		}else if(number%3==0 ){
			
			System.out.println("Fizz");
		}
       sc.close();
	}

}

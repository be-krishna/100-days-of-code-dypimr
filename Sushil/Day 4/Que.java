/*1.Implement a program that asks the user for numbers (the program first prints "Write numbers: ") until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends. */
/*2.Extend the program so that it prints the sum of the numbers (not including the -1) the user has written. */
/*3.Extend the program so that it also prints the number of numbers (not including the -1) the user has written. */
/*4.Extend the program so that it prints the mean of the numbers (not including the -1) the user has written. */
/*5.Extend the program so that it prints the number of even and odd numbers (excluding the -1). */


package Day_4;

import java.util.Scanner;

public class Que {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0; // this one is going to be user Input
		int sum = 0;
		int count = 0;	
		int evencount=0;
		int oddcount = 0;
		
		while(true) {
			System.out.println("Give the Number or -1 to Stop:");
		    num = sc.nextInt();
		    
		   // Que 1. print when userInput -1
		    if(num == -1) {
		    	System.out.println("Thax! Bye");
		    	break;
		    }
		    
		    
		    // Que 5 : Find Odd or Even 
		    if(num % 2 == 0) {
		    	evencount++;
		    }else {
		    	oddcount++;
		    }
		    
		    // Que 3. Number of Input Count
		    count++;
		    
		    //Que 2. Sum of All the Inputs Except -1 
		    sum += num;
		}
		    System.out.println("Sum of the given Number :" + sum);
		    System.out.println("Number of Input:" + count);
		    
		    // Que 4. Average of the given Input
		    double avg = (double) sum/count;
		    
		    
		    System.out.println("Average:" + avg);
		    System.out.println("Even:" + evencount);
		    System.out.println("Odd:" + oddcount);
		    sc.close();
	}

}

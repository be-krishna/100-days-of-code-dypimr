/*1.Write a program in Java to display the pattern like right angle triangle with a number.*/

package Day_7;

import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		
		  int number , row, col;

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the Number:"); 
	        number = sc.nextInt();


	        for( row = 1; row <= number ;row++){
	           for(col = 1; col <= row ; col++){
	               System.out.print(col + "");
	           }

	           System.out.println();
	       }
     sc.close();
	}

}

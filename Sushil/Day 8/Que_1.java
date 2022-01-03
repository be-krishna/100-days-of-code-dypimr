

import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number: ");
	        int row = sc.nextInt();
	        
        for(int i = 1 ; i <= row ; i++) {
        	
	            for(int j = 1 ; j <= row ; j++) {
	            	if(i == 1 || i == row ||
	            	   j == 1 || j == row) {
	            		System.out.print("* ");
	            	}else { 
	            		System.out.print("  ");
	            	
	            }
	     }   
	            System.out.println();
      sc.close();
	 }
  } 
}
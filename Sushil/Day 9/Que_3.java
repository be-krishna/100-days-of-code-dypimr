/*Triangle Star pattern*/

import java.util.Scanner;

public class Que_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
	      int rows = sc.nextInt();
	    
	     
	      for(int i = 0; i < rows ; i++) {
	    	  System.out.println();
	    	  
	    	  for(int j = 1; j < rows - i; j++) {
	    		  System.out.print(" ");
	    	  }
	    	  if( i == 0 || i == rows -1) {
	    		  for(int j = 0; j<= i; j++) {
		    		  System.out.print("* ");
	    	  }
	    	}else {
	    		
	    		System.out.print("*");
	    		for (int j = 0; j < (i * 2 - 1); j++) {
	    	          System.out.print(" ");
	    		}    
	    		System.out.print("*");
	    		}
	       
	    	}
	      System.out.println();
	      sc.close();
	   }
	}
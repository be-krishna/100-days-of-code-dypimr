/*Right Pascal’s Triangle */ 

import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		

		 Scanner sc = new Scanner(System.in);
              System.out.println("Enter the number of rows :");
		    int num = sc.nextInt();

		    int rows = 2 * num - 1 ;

		    for(int i = 1; i <= rows ; i++){
		        
		        if(i <= num){
		            for(int j = 1; j<=i ; j++){
		                System.out.print("* ");
		            }
		        }else{
		            for(int j =1 ; j <= rows - i + 1; j++){
		                System.out.print("* ");
		            }
		        }
		        System.out.println();
		    }
		    sc.close();
	}

}

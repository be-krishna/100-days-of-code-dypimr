package Day_3;
import java.util.Scanner;
public class CountInput {

	public static void main(String[] args) {
	      int num = 0;    // Initally the value of the integer assigned is Zero.     
	      int count = 0;   // Initally the value of the integer assigned is Zero.
    
       Scanner sc= new Scanner(System.in); 
 
	        while (true) {
	            System.out.print("Enter the Number to Start or 0 to Stop : ");
	            num= sc.nextInt();    // Here the user is going to give the Input
	            if(n == 0){
	                break;
	            }
	            count+=1;     // count = count + 1; the count will eventually going to Increment by one with Each Input until the break point which is zero
 
	 }
	        System.out.println(count);   // then we are going to print our count 
	        sc.close();
	}
 }

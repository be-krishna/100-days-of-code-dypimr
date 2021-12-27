import java.util.Scanner;

public class SumTill_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int i = 0;     // Initial value is 0
       int sum = i;  // initial value became i so when you are going to give new value it show the previous value 
       do {
    	   System.out.println("Enter the Number:" + i);
    	   i = sc.nextInt();   // Our UserInput
    	   sum+=i;             // sum = sum + i
       }while(i!=0);{
    	   System.out.println("The sum of Given number is " + sum);   // when user give an input of 0 this process is going to happen
       }
	}

}

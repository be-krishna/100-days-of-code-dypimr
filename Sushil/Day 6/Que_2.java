/*Write a Java program to find the number of days in a month. */

package Day_6;

import java.time.YearMonth;
import java.util.Scanner;

public class Que_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] monthName = new String[] {"January","February","March","April","May","June","July","Augest","Septmber","October","November","December"}; 
        
		System.out.println("Input a month number: ");
		int month = sc.nextInt();
		
		System.out.println("Input a Year: ");
		int year = sc.nextInt();
		
		YearMonth yearMonthObject = YearMonth.of(year, month);
		int daysInMonth = yearMonthObject.lengthOfMonth();
		
		System.out.println(monthName[month - 1] + " " + year +" has "+ daysInMonth + " days");
				
	    sc.close();
	  }

}

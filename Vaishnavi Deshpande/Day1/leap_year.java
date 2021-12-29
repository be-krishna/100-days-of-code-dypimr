import java.util.Scanner;

public class leapyear {
    
    public static void main(String[] args){
        int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
  
        if ((year % 4 == 0) )
           System.out.println("This year is a leap year");
        else
           System.out.println("This year is not a leap year");
     }
}




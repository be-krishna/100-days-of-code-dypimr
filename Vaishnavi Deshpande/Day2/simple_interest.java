import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        int p,r,t,SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount: ");
        p= sc.nextInt();

        System.out.println("Enter the rate : ");
        r= sc.nextInt();

        System.out.println( "Enter the time_Period : ");
        t= sc.nextInt();

        SI=(p*r*t)/100;

       System.out.println("the Simple interest is : "+SI);
    }
 
}

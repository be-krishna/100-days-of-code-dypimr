import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Principle Amount:");
        int p = s.nextInt();
        System.out.println("Rate of Interest:");
        int r = s.nextInt();
        System.out.println("Time:");
        int t = s.nextInt();
        // For All three I assigne them as an Integer And they all will get the value from UserInput 
        // At last as you know rate is always at % that's why i divide this by 100 and you will get your simple Interest
        
        System.out.println("Simple Interest:" + (p * r * t / 100) );
	}  
}

import java.util.Scanner;
public class day3_prog2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter a number : ");
         num= sc.nextInt();
         
        while (num<=100)
        {
            if(num % 3 ==0 && num % 5 == 0){
                System.out.println("fizbizzz");
            break;
            }
            if(num % 3 == 0){
                System.out.println("fizz");
                break;
            }
            if(num % 5 == 0){
                System.out.println("bizz");
                break;
            }
            if(num >100){
                System.out.println("plz enter no less than 100");
            
            }
        }

    }
  
}

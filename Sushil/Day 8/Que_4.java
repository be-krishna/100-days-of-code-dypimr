import java.util.Scanner;

public class Que_4 {
      public static void main(String[] args) {
          int row , num , i ;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number: ");
          num = sc.nextInt();
        
         for( row = 1 ; row <= num ;row++){
          
             if(row % 2 != 0){
                i =  0;

                for(int j = 1; j <= num; j++){
                    System.out.print(i);
                    i = (i == 0) ? 1 : 0;
                }
                System.out.println();
             }else{
                 i = 1;
                 for(int j = 1; j <= num; j++){
                    System.out.print(i);
                    i = (i == 0) ? 1 : 0;
                }

                System.out.println();
             }
             
             
             sc.close();
         }

    }
}
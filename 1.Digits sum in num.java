/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        
        Scanner lol = new Scanner (System.in);
        
        System.out.println("Enter a num between 0 and 1000");
        int num = lol.nextInt();
        
        if(num < 0 || num >1000){
            System.out.println("This num is not betwenn 0 & 1000");
        }
        else{
            
            int sum=0;
            
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            
            System.out.println("Sum of num :" + sum);
            
        }
        
        
    }
    
    
    
}

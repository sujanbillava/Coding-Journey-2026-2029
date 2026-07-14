import java.io.*;
import java.util.Scanner;
public class sumofdigit 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits");
        int number=sc.nextInt();
        
        int sum=0;
        
        while(number>0)
        {
            int digit= number % 10;
            sum=sum+digit;
            number=number/10;
            System.out.println("Sum is="+sum);
        }
         System.out.println("Sum is="+sum);
    }    
}

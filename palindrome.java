import java.util.*;

public class palindrome {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int origin=number;
        int reverse=0;
        while(number>0)
        {
            int digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;

        }
        if(origin==reverse)
        {
            System.out.println("This Number is Palindrome");
        }
        else{
            System.out.println("This Number is Not Palindrome");
        }
    }
    
}

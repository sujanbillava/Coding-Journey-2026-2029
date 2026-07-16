import java.io.*;
import java.util.Scanner;

public class digitcount
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digit:");
        int digit=sc.nextInt();
        int count=0;
      

        while(digit>0)
        {
           digit=digit/10;
           
           count=count+1;
           
        }
        System.out.println("The Total Digit is="+count);
    }
}


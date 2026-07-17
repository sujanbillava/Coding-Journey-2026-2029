import java.io.*;
import java.util.*;
public class highestnumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number=");
        int a=sc.nextInt();
        System.out.println("Enter the second Number=");
        int b=sc.nextInt();
        System.out.println("Enter the third Number=");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Greatest Number is="+a);
        }
        else if (b>a && b>c) 
        {
            System.out.println("Greatest Number is="+b);    
        }
        else
        {
            System.out.println("Greatest Number is="+c);
        }
    }
}
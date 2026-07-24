import java.util.*;
public class Return 
{
    public static int add(int a,int b)
    {
        return a+b;
    }    
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number=");
        int a=sc.nextInt();
        System.out.print("Enter Second Number=");
        int b=sc.nextInt();
        int add=add(a,b);
        int mul=mul(a,b);
        System.out.println("Addition="+add);
        System.out.println("Multiplication="+mul);    
    }
}

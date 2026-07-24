
import java.util.*;

public class ReturnMethod 
{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static void main(String[]args)
    {
        int addresult=add(2,8);
        int mulresult=mul(2,5);
        System.out.println("Addition="+addresult);
        System.out.println("Multiplication="+mulresult);
    }
}

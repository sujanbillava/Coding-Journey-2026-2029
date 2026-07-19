import java.io.*;
import java.util.*;

public class forloop 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr Your Name=");
        String name=sc.nextLine();
        System.out.print("Enetr How Many Times...=");
        int num=sc.nextInt();
        for(int i=1; i<=num; i++)
        {
            System.out.println(name);
        }
    }    
}

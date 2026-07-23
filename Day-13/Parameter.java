import java.util.*;

public class Parameter 
{
    public static void welcome(String name)
    {
        System.out.println("Welcome"+ name);
    }
    public static void studentdetails(String name,int age)
    {
        System.out.println(name+ age);
    }
    public static void exit()
    {
        System.out.println("Program Closed");
    }
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Choose any One\n1.Welcome\n2.Student details\n3.Exit");
            System.out.println("Choose your Choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    welcome("Sujan");
                    break;
                case 2:
                    studentdetails("Sujan",19);
                    break;
                case 3:
                    exit();
            }
        }
    }
}

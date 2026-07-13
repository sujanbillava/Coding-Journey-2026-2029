
import java.util.Scanner;
public class Numberguess 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int guessnumber=((int)(Math.random()*100));
        System.out.println("Guess Correct Number To Win The Game!!!!");
        System.out.println("Press -1 To Exit Game");
        while(true)
        {
            System.out.println("Enter the Number??:");
            int correctnumber=sc.nextInt();
            if(correctnumber==-1)
            {
                System.out.println("You are Exit From the Game!");
                break;
            }
            if(correctnumber==guessnumber)
            {
                System.out.println("Wow!! ,You Enter Correct Number,You win This Game!!");
                break;
            }
            else if(correctnumber>guessnumber)
            {
                System.out.println("You Enter the Greater Number,Press lesser Than This");
            }
            else
            {
                System.out.println("You Enter the Lower Number,Press Greater Than This");
            }
        }
    }
}

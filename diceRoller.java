import java.util.Random;
import java.util.Scanner;
public class diceRoller
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Random ran=new Random();
        System.out.printf("Enter the number of dice to roll: ");
        int choice=sc.nextInt();
        int roll;
        int total=0;
        if(choice>0)
        {
            for(int i=1; i<=choice; i++)
            {
                roll=ran.nextInt(1,7);
                System.out.printf("You rolled: %d\n",roll);
                dicePrint(roll);
                total+=roll;
            }
            System.out.printf("Total is %d",total);
        }
        else
        {
            System.out.printf("The choice shouldn't be zero or negative number,please try again.");
        }
        sc.close();
    }
    static void dicePrint(int roll)
    {
        String dice1="""
                 -------
                |       |
                |   ●   |
                |       |
                 -------      
        """;
        String dice2="""
                 -------
                | ●     |
                |       |
                |     ● |
                 -------      
        """;
        String dice3="""
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------      
        """;
        String dice4="""
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------      
        """;
        String dice5="""
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------      
        """;
        String dice6="""
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------      
        """;
        switch(roll)
        {
            case 1: System.out.println(dice1);
            break;
            case 2: System.out.println(dice2);
            break;
            case 3: System.out.println(dice3);
            break;
            case 4: System.out.println(dice4);
            break;
            case 5: System.out.println(dice5);
            break;
            case 6: System.out.println(dice6);
            break;
        }
    }
}
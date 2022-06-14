import java.util.Random;
import java.util.Scanner;
class rock_paper_scissor_game {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        System.out.print("Your choice: ");
        int userInput=sc.nextInt();

        Random random = new Random();
        int compInput=random.nextInt(3);

        if(userInput==compInput)
        {
            System.out.println("Draw");
        }
        else if(userInput==0 && compInput==2  || userInput==1 && compInput==0  || userInput==2 && compInput==1)
        {
            System.out.println("You win!");
        }
        else{
            System.out.println("Computer Wins!");
        }

        //Computer's Choice
        if(compInput==0)
        {
            System.out.println("Computer's choice: Rock");
        }
        else if(compInput==1)
        {
            System.out.println("Computer's choice: Paper");
        }
        else if(compInput==2)
        {
            System.out.println("Computer's choice: Scissor");
        }
        sc.close();
    }
}

import java.util.Scanner;
import java.util.Random;
public class guess_number_game {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number");     
        System.out.print("Enter a number: ");
        double userIn=sc.nextInt();
        
        Random random = new Random();
        double compIn=random.nextInt(10);

        if(userIn==compIn)
        {
            System.out.println("You guessed the correct number"); 
            b=true;  
        }
        else if(userIn > compIn)
        {
            System.out.println("You have guessed a larger number");
        }
        else if(userIn < compIn)
        {
            System.out.println("You have guessed a smaller number");
        }  

        sc.close();
    }
}

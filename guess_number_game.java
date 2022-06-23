import java.util.Scanner;
public class guess_number_game {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber=0;
        int guesses=0;

        do{
            System.out.println("Guess my number(1-100): ");
            userNumber=sc.nextInt();

            if(userNumber == myNumber)
            {
                System.out.println("You have guessed correct number!!!");
                break;
            }

            else if(userNumber > myNumber)
                System.out.println("The number is too large");
        
            else
                System.out.println("The number is too small");

            guesses++;
        }while(userNumber >= 0);

        System.out.println("My number was: "+myNumber);
        System.out.println("Number of guesses: "+guesses);
        
        sc.close();
    }
}

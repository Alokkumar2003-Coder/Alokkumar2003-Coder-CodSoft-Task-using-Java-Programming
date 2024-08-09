import java.util.Random;
import java.util.Scanner;

public class GuessNo 
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int score = 0;
        boolean playAgain = true;
        int attemptsAllowed = 10;

        while(playAgain)
        {
            int numberToGuess = rm.nextInt(100)+1;
            int attempts = 0;
            boolean guessCorrectly = false;

            System.out.println("A new number has been generated! Try to guess it.");
            
            while (attempts < attemptsAllowed && !guessCorrectly) 
            {
                System.out.println("Attempt" + (attempts+1)
                + "/" + attemptsAllowed + ": Enter your guess(1-100): ");

                System.out.println("Enter Your Number : ");

                int userGuess = sc.nextInt();
                attempts++;


                if(userGuess < 1 || userGuess>100)
                {
                    System.out.println("Plz Guess number btw 1 to 100.");
                }
                else 
                if(userGuess < numberToGuess)
                {
                    System.out.println("Too Small!");
                }
                else
                if(userGuess > numberToGuess)
                {
                    System.out.println("Too Big!");
                }
                else 
                {
                    System.out.println("Congratulations! You guessed the correct number!");
                    guessCorrectly = true;
                    score++;
                }
            }

                if(!guessCorrectly)
                {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
                }
                System.out.println("Your current score is: " +score);


                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainInput = sc.next().trim().toLowerCase();
                if(!playAgainInput.equals("yes"))
                {
                    playAgain = false;
                }
            }

            System.out.println("Game over! Your final score is: " +score);
        }
    }



        
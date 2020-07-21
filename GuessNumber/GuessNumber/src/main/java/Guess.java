
import java.util.Random;
import java.util.Scanner;

public class Guess {


    int userGuess;
    boolean correct = false;
    int compScore = 0;
    int userScore = 0;
    int guessLimit = 0;

    Random random = new Random();

    int randomNumber = random.nextInt(51); //computer's random number

    Scanner scanner = new Scanner(System.in);


    public void playGame() {
        System.out.println("The computer will pick a number between 1-50 and you have to guess it");

        while (userScore != 3 && compScore != 3) {
            while (guessLimit != 3) {
                System.out.println("Enter a number: ");
                userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Your guess is correct.");
                    System.out.println("Congrats you have won this round");
                    correct = true;
                    userScore++;
                    guessLimit++;
                    break;

                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is smaller than the Computer's number");
                    guessLimit++;
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is greater than the Computer's number");
                    guessLimit++;

                }
                if (guessLimit == 3 && correct == false) {
                    System.out.println("You have not guessed correctly. The Computer wins this round.The correct number is: " + randomNumber);
                    compScore++;
                }


            }


        }
        if (userScore == 3) {
            System.out.println("Congrats you are the winner");
        } else {
            System.out.println("Sorry, the computer is the Winner, better luck next time ");
        }

    }
}

























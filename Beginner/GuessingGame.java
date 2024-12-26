import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int start= 1;
        int end = 100;
        int numberToGuess = rd.nextInt(end - start + 1) + start;
        int countTry = 0;
        boolean GuessedRightNumber = false;
        System.out.println("Welcome to you to the Guessing Game! ");
        System.out.println("I have selected a number between " + start + " and " + end + ".");
        System.out.println("Try to guess the number that I have selected!");

        while (!GuessedRightNumber) {
            System.out.print(" Guess a number : ");
            int GuessedNumber = sc.nextInt();
            countTry++;
            if (GuessedNumber < start || GuessedNumber > end) {
                System.out.println("Please guess a number within the range of " + start+ " to " + end + ".");
            } 
            else if (GuessedNumber < numberToGuess) {
                System.out.println("Too low! Try again.");
            }
             else if (GuessedNumber > numberToGuess) {
                System.out.println("Too high! Try again.");
            } 
            else {
                GuessedRightNumber = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + countTry + " tries.");
            }
        }
        System.out.println("Thank you for playing!");
    }
    
    }


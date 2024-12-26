
import java.util.*;
public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 5;
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("You will be asked " + totalQuestions + " questions. Let's see how many you can answer correctly!");
        
        // Question 1
        System.out.println("\nQuestion 1: what is the product of any number with 0 ?");
        System.out.println("a) 1");
        System.out.println("b) any number");
        System.out.println("c) undefined");
        System.out.println("d) 0 ");
        System.out.print("your answer:");
        String answer1 = sc.nextLine();
        if (answer1.equalsIgnoreCase("d")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is d) 0.");
        }

        // Question 2
        System.out.println("Question 2: What is 2 + 2 ?");
        System.out.println("a) 6");
        System.out.println("b) 4");
        System.out.println("c) 9");
        System.out.println("d) 8");
        System.out.print("your answer:");
        String answer2 = sc.nextLine();
        if (answer2.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) 4.");
        }

        // Question 3
        System.out.println("Question 3: What is the only fruit that has seeds on the outside ?");
        System.out.println("a) kiwi");
        System.out.println("b) Strawberry");
        System.out.println("c) Apple");
        System.out.println("d) Mango");
        System.out.print("your answer:");
        String answer3 = sc.nextLine();
        if (answer3.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) Strawberry.");
        }

        //question 4
        System.out.println("Question 4: Who is the only mammal capable of true flight ?");
        System.out.println("a) Bat");
        System.out.println("b) crow");
        System.out.println("c) Elephant");
        System.out.println("d) Human");
        System.out.print("your answer:");
        String answer4 = sc.nextLine();
        if (answer4.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a)Bat.");
        }

        //question 5
        System.out.println("Question 5:  What is the largest organ in the human body ?");
        System.out.println("a) Heart");
        System.out.println("b) lungs");
        System.out.println("c) skin");
        System.out.println("d) blood");
        System.out.print("your answer:");
        String answer5 = sc.nextLine();
        if (answer5.equalsIgnoreCase("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is c) skin.");
        }
        System.out.println("\nGame Over! Your score is: " + score + " out of " + totalQuestions);
        System.out.println("Thank you for playing!");
    }
}

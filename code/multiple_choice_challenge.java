import java.util.Scanner;

public class multiple_choice_challenge {
    public static void main(String[] args) {
        Boolean questionInProgress = true;
        while(questionInProgress) {
        System.out.println("Which of the following mechanical keyboard switches has a linear response?");
        System.out.println("a. Cherry MX Blue");
        System.out.println("b. Cherry MX Red");
        System.out.println("c. Cherry MX Brown");
        String correctAnswer = "b";

        Scanner input = new Scanner(System.in);
        System.out.println("Please give the letter for your answer: ");
        String UserAnswer = input.next();
        if(UserAnswer.toLowerCase().equals(correctAnswer)) {
            System.out.println("Congratulations! You answered correctly.");
            questionInProgress = false;
        } else {
           System.out.println("Sorry, that is incorrect. Please try again.");
           }
        }
    }
}

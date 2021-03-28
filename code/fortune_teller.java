import java.util.Scanner;

public class fortune_teller {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10.");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a fiend brings you");
        } else {
            System.out.println("Your guitar selection will make you very happy today.");

        }
    }
}
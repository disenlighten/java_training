import java.util.Scanner;

public class function_test {
    public static void announceDeveloperTeaTime() {
    System.out.println("Waiting for Developer Tea Time.");
    System.out.println("Type in a random word and press enter to start.");
    Scanner input = new Scanner(System.in);
    input.next();
    System.out.println("It's developer tea time.");    
    }
    public static void main(String[] args) {
    announceDeveloperTeaTime();
    }
}
import java.util.Scanner;

public class string_formatting {
    public static void main(String[] args) {
        double studentGPA = 3.45;
        String studentFirstName = "Jamie"; 
        String studentLastName = "Pemantell";
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");
        
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + 
        " now has GPA of " + studentGPA);

    }
}

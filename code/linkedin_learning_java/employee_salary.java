import java.util.Scanner;

public class employee_salary {
    public static double CalculateEmployeeSalary(int hoursPerWeek, double ratePerHour, int vacationDays) {
        double myResult = ((hoursPerWeek * ratePerHour) * 52) - (vacationDays * (ratePerHour * 8));
        return myResult;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's hours per week worked.");
        int hoursPerWeek = input.nextInt();
        System.out.println("Enter employee's rate per hour.");
        double ratePerHour = input.nextDouble();
        System.out.println("Enter employee's number of benefit days.");
        int vacationDays = input.nextInt();
        double myResult = CalculateEmployeeSalary(hoursPerWeek, ratePerHour, vacationDays);
        System.out.println("Employee's annual salary is: $" + myResult);
    }
}
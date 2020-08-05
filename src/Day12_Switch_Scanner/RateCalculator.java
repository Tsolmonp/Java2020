package Day12_Switch_Scanner;

import java.util.Scanner;
/*Task:
        write a program for the rate calculator
       1. ask the user to enter the salary (as double)
       2. ask the user how many hours does she /he  works in week
       3. print hourly rate of the employee
*/

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annually salary: ");
        double salary = input.nextDouble();
        System.out.println("How many hours do you work in a week");
        int weeklyHour = input.nextInt();
        int totalHours = weeklyHour * 52;

        double hourlyRate = salary / totalHours;

        System.out.println("Your hourly rate is: $"+hourlyRate);


    }
}

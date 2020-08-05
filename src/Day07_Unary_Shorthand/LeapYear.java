package Day07_Unary_Shorthand;
/* create a class called LeapYear, and write a program that can identify if the

 */

public class LeapYear {
    public static void main(String[] args) {
       int year = 2020;
            boolean result = year % 4 == 0;
        System.out.println("Year " +  year + "is a leap year: " +result); //2021 is a leap year: false


    }
}

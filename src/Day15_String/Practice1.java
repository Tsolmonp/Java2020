package Day15_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //write program that asks the user enter first then last name.
        // print the initials of the
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firsName = input.next(); //Cybertek
          char ch1 = firsName.charAt(0);
        System.out.println("Enter last name: ");
        String lastName = input.next();// School
        char ch2 = lastName.charAt(5);

        System.out.println("Your initial is:" +ch1+ "." +ch2);
    }

}

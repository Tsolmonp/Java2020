package Day15_String;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        String fullName = firstName+ " " +lastName;

        fullName = fullName.toUpperCase(); //Cybertek School

        System.out.println(fullName);

    }
}

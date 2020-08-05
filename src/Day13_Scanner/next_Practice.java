package Day13_Scanner;

import java.util.Scanner;

public class next_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();//Cybertek
        System.out.println("Enter your Last Name: ");
        String lastName = scan.next();
        String fullName = firstName+" "+lastName;
        System.out.println("Full Name is: "+fullName);
    }
}

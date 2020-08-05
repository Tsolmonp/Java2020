package Day18_ForLoop;

import java.util.Scanner;

/*
 write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method
 */
public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        String lastName = scan.next();
        /*
        String initial = firstName.substring(0, 1) + " . " +lastName.substring(0, 1);
        initial= initial.toUpperCase();
        System.out.println(initial);

         */
         char ch1 = firstName.charAt(0);
         char ch2 = lastName.charAt(0);

        System.out.println(ch1+ch2);

        String initial = ""+ch1+"." +ch2;
                initial = initial.toUpperCase();

        System.out.println(initial);

    }
}

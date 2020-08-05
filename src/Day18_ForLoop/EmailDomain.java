package Day18_ForLoop;
/*
write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
 */

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String email = scan.next();
        //              0123456789
        //String email = scan.next();
        //              012345678
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");
        String domain = email.substring(index1+1, index2);
        System.out.println(domain);





    }
}

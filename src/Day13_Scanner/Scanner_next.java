package Day13_Scanner;

import java.util.Scanner;

public class Scanner_next {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = s.nextInt();
        int com = s.nextInt();

        for (int j = 1; com <= n; j++) {
            for (int k = 1; com >= row; com++) {
                System.out.print("*");

            }
            System.out.println();


        }

    }
}


       /* System.out.println("Enter your company name: ");
            String companyName = scan.next();

        System.out.println("Your company name: " +companyName);
    }
}
*/
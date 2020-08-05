package Day13_Scanner;


import java.util.Scanner;

public class nextLine_VS_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Enter
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();//120000
        scan.nextLine();//Enter
         //use this to take out the "enter"s that are left in the scanner.
        // so that we can use the next

        System.out.println("Enter your full name: ");
        String fullName =  scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);


    }





}

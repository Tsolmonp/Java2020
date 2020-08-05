package Day23_Array;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        String months[] ={"Jan","Feb","March","April","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1~12");
        int n = scan.nextInt();//5

        System.out.println(months[n-1]);



    }
}

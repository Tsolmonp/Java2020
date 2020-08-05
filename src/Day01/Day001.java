package Day01;

import java.util.Scanner;

public class Day001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        int two = scan.nextInt();
        if(one-- > two * 2){
            System.out.println("one");

        }else{
            System.out.println(two);
        }

        }
}
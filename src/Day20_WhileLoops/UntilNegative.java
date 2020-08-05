package Day20_WhileLoops;

import java.util.Scanner;

/*
1. write a program that can print the numbers between 1 to 100.
                if the number is divivible by 3, do not print it
 */
public class UntilNegative {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i =  0; i == 0; ){ //infinitive loop

            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num<0){
                break;
            }
            sum += num;
        }
        System.out.println("sum is: " +sum);
    }

}

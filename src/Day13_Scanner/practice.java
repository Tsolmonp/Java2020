package Day13_Scanner;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        char first = word.charAt(0);
        char last = word.charAt(word.length() -1);
        String firstLast = word.charAt(0)+ ""+ word.charAt(word.length()-1);

        System.out.println(firstLast);


    }
}




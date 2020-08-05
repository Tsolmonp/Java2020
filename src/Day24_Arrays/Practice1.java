package Day24_Arrays;

import java.util.Scanner;

/*
The code provided in your main method will take in
five Strings and save them into an array called arr.
 Print out the first three letters of each element
 of arr, one per line.  You can assume that every
 element of arr is at least 3 letters long.
 */
public class Practice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        System.out.println(arr[0]);
    }
}
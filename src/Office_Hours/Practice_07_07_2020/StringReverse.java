package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
      String str = "";
        //            0123456


/*
        str.charAt(6);
        str.charAt(5);
        str.charAt(4);
        str.charAt(3);
        str.charAt(2);
        str.charAt(1);
        str.charAt(0);
*/
        String result = "";//"02hctaB"

        for(int i = str.length()-1; i >=0;i -= 1){
           result += str.charAt(i);
        }


        System.out.println(result);
        System.out.println("============================");
        String result2 = "";
        int index = str.length()-1;

        while(index >= 0){
            result += str.charAt(index);

            index -= 1;
        }


    }
}

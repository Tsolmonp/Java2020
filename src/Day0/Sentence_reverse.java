package Day0;

import java.util.Arrays;

public class Sentence_reverse {
    public static void main(String[] args) {


        String str = "Hello. Java";
        System.out.println(word(str));

    }

    public static String word(String str){
        //String str = "I.love.group.nine";
        String reversed = "";
        String[] arr = str.split("\\.");
        System.out.println( Arrays.toString(arr) );
        for(int i=arr.length-1; i>=0; i--){
            reversed += arr[i] + " ";
        }
            /*
                if(str.charAt(0) == str.length()-1) {
                    reversed += arr[i];
                }else{
                    reversed += arr[i] + ".";
                }
            */
        reversed = reversed.substring(0, reversed.length()-1);

        return reversed;

    }
    }






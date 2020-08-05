package Day16_String;
/*
 3. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
    4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
Collapse
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        String str = "ABC";
        //last index = length -1
        // second last index = length -2
        //third last index = length -3
        if (str.length() == 0) {
            System.out.println("empty string");

        } else if (str.length() > 3) {
            System.out.println(str.substring(str.length() - 3));
        } else {
            System.out.println(str);
        }
        String result = (str.length() == 0) ? "empty string" :
                (str.length() > 3) ? str.substring(str.length() - 3) : str;
        System.out.println("================================");

        String str1 = "abc";
        String str2 = "abcd";
        String str3 = "abcd";

        boolean allSame = str1.length() == str2.length() && str1.length() == str3.length();
        boolean allDifferent = str1.length() != str2.length() && str2.length() != str3.length() && str1.length() != str3.length();

        if (allSame) {
            System.out.println("All words are same length");
        } else if (allDifferent) {
            System.out.println("All different length");
        } else {
            System.out.println("Not Same nor Different lengths");

            String s3 = "I like to drink tea and tea";
            s3 = s3.replaceFirst("tea", "cola");

            System.out.println(s3);

            String s4 = "I like to Watch Game of thrones,and walking dead";
                    s4 = s4.replace(" 'and Walking dead" , "");
            System.out.println(s4);

            //indexOf()

            String s5 = "I like to stay in cybertek, we are learning java";
            int r1 = s5.indexOf("l");
            int r2 = s5.indexOf("re");//returns the first char 'r' index
            int r3 = s5.indexOf("a"); //returns the first char 'r' index

            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r3);

            //lastIndexOf()
            String s6 = "Java is a programming language, and Java is fun";
            int I1 = s6.indexOf("Java is fun");
            int I2 = s6.lastIndexOf("J");


            System.out.println(I1);
            System.out.println(I2);

            String s7 = "Java";
               int a1 = s7.indexOf("C");//not exist mean -1

            System.out.println(a1);

            String s8 = "Java";
            int a = s8.indexOf("a");

            char ch = s8.charAt(a);
            System.out.println(a);


        }
    }
}

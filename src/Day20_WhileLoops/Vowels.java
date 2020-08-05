package Day20_WhileLoops;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vowels = "";

        //input from user
        String answer = input.nextLine();

        //loop to find vowels

        for (int i = 0; i < answer.length(); i++) {
            char answerPosition = answer.charAt(i);

            //checks if there are vowels in code
            if (answerPosition == 'a' || answerPosition == 'e'
                    || answerPosition == 'i'
                    || answerPosition == 'o'
                    || answerPosition == 'u'
                    || answerPosition == 'A'
                    || answerPosition == 'I'
                    || answerPosition == 'O'
                    || answerPosition == 'U') {
                vowels += answerPosition + " ";

            }

        }
        System.out.println("The vowels are:" + vowels);


    }
}
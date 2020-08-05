package Day15_String;

public class Substring_method {

    public static void main(String[] args) {
        String sentence = "Java is fun";
        //                 012345678910
        // substring(beg index, end index)
        String  word1 = sentence.substring(0, 3+1);

        System.out.println(word1);
        String word2 = sentence.substring(8, 11);
        System.out.println(word2);
        System.out.println("=======================");

        String sentence2 = "I like Movies and TV Series";

        String word3 = sentence2.substring(7, 12+1);
        System.out.println(word3);
        System.out.println("==============================");
        String firstName = "aRCHIE";//convert to lowerCase
        String firstCharacter = firstName.substring(0, 1);
        String rest = firstName.substring(1, firstName.length()); //firstName.Length(): lastIndex + 1

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();


        System.out.println(firstName);
        System.out.println("================================================");
        String lastName = "cHristina";
        String firsChar = lastName.substring(0,2); //s
        String remaining = lastName.substring(1);// chool

        System.out.println(firsChar);
        System.out.println(remaining);

        lastName=firstCharacter.toUpperCase() + remaining.toLowerCase();//SCHOOL

        System.out.println(lastName);
        System.out.println("====================================");

        String s = "I like Game Of Thrones";
        //          01234567
        String series = s.substring(7);
        System.out.println(series);

        String s2 = "I like Java Programming Language";

        String language = s2.substring(7);
        System.out.println(language);







    }

}

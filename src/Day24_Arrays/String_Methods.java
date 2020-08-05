package Day24_Arrays;

import java.util.Arrays;

public class String_Methods {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJ";
        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("=========================================");
        String str1 = "DCEBAF";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray();//DCEBA
        char[] ch2 = str2.toCharArray();//ADCBE

        Arrays.sort(ch1);//[ABCDE]
        Arrays.sort(ch2);//[ABCDE]

        Arrays.equals(ch1,ch2);
        boolean r1 = Arrays.equals(ch1, ch2);
        System.out.println(r1);

        System.out.println("================================");

        String sentence = "I love programming Language";

        String[]words = sentence.split("");
        System.out.println(Arrays.toString(words));

        for(int i = words.length-1; i >= 0; i--){
            System.out.print(words[i]+" ");

        }
        System.out.println();
        System.out.println("=================================");

        String s = "JAVA";
        s.split("");
        String [] arr = s.split("");//every single elements are string
        System.out.println(Arrays.toString(arr));

        char[]c = s.toCharArray();//every single elements are char
        System.out.println(Arrays.toString(c));


    }
}

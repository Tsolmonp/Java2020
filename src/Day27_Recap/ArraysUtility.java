package Day27_Recap;

import java.util.Arrays;

public class ArraysUtility {
    /*
    sort():
    toString():
    equals():
     */

    public static void main(String[] args) {

        String[] names = {"Odina", "Berk", "Lilia", "Emine"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        int[] score = {88,75,98,88,45,33,110};

        Arrays.sort(score);

        System.out.println(Arrays.toString(score));

        System.out.println("Maximum: "+ score[score.length-1]);
        System.out.println("Minimum: "+score[0]);

        System.out.println("====================================");

        String[] s1 = {"A", "B","C"};
        String [] s2 = {"A", "B","C"};

        System.out.println(Arrays.equals(s1,s2));

        String[] s3 = {"C", "A","B"};
        System.out.println(Arrays.equals(s1,s3));

        String[] a1 = {"A","C","B"};
        String[] a2 ={"B","A","C"};

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2));




    }
}

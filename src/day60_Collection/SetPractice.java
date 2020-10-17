package day60_Collection;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String str = "ddddddddcccccccbbbbbbbbaaaaaaaaa"; // dcba

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr)); //

        //

        Set<String> s1 = new LinkedHashSet<>();
        s1.addAll(Arrays.asList(arr));

        System.out.println(s1);

        System.out.println("=========================");

        String str2 = "ttttyyyyyuuuuuuuiiiiiiaaaaaaaaa";

        str2 = new LinkedHashSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str2);

        str2 = str2.replace("[", "").replace(", ", "").replace("]", "");

        System.out.println(str2);

        System.out.println("==========================");
        String a1 = "abcabc";
        String a2 = "cabbcb";

        HashSet<String> b1 = new HashSet<>();
        b1.addAll(Arrays.asList(a1.split("")));
        System.out.println(b1);

        HashSet<String> b2 = new HashSet<>();
        b2.addAll(Arrays.asList(a2.split("")));
        System.out.println(b2);

        a1 = b1.toString();
        a2 = b2.toString();

        System.out.println(b1.equals(b2));
        System.out.println("=============================");
        String x1 = "cacaabb";
        String x2 = "bbccaaaa";

        x1 = new TreeSet<>(Arrays.asList(x1.split(""))).toString();
        x2 = new TreeSet<>(Arrays.asList(x2.split(""))).toString();

        System.out.println(x1.equals(x2));

        System.out.println("======================================");

        String[] names = {"Aalia", "Mustafa", "Elkem","Aalia","Virginia"};

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(names));

        //System.out.println(set1);

        names = set1.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

        System.out.println("=====================================");
        String[] names2 = {"Roman", "Abzal","Nurbiye","Roman","Roman"};

        names2=new LinkedHashSet<>(Arrays.asList(names2)).toArray(new String[0]);

        System.out.println(Arrays.toString(names2));

        System.out.println("======================================");

        Integer[] numbers = {1,1,1,2,2,2,0,0,0,0,1,1,3,3,3,5,5,6,7,7,8,8,9,9};

        //numbers= new LinkedHashSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);
        numbers= new TreeSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(numbers));
    }
}
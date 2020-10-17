package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {
        //String str = null;
        //System.out.println(str.toUpperCase());
        String[] names = {"Dawud","Selman", "Aslan","Aslan", "Aslan"};

        Set<String > hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(names));
        System.out.println("Hash Set: "+hashSet);

        Set<String>linkedHashSet = new LinkedHashSet<>();
       linkedHashSet.addAll(Arrays.asList(names));
        System.out.println("LinkedHashSet: "+linkedHashSet);

        Set<String>treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(names));
        System.out.println("Tree Set: "+treeSet);

    }
}

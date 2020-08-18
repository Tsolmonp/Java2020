package Office_Hours.Practice_08_12_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3));
                        //         0  1 2
        //int a = 1;//index//1.3
        Integer a = 1;//Object//2,3

        boolean r1 = list1.remove(a);
        list1.remove(a);//2
        System.out.println(list1);//1,3

        String[] names = {"Robb","Bran","Rick","Bran"};

        ArrayList<String > namelist = new ArrayList<>();
        namelist.addAll(Arrays.asList(names));
        if(namelist.remove("Bran")){
            namelist.remove("John");
        }
        System.out.println(namelist);
        System.out.println("=================================");

        ArrayList<String>colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add(3,"cyon");//3is index num is shifted to next num

        System.out.println(colors);

        System.out.println("=============================");

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));
                    //             0 1 2 3 4
                    //             5 2 3 4 0

        list2.set(0,list2.get(4));//5 2 3 4 0
        list2.set(4,list2.get(0));//5
        Collections.swap(list2,0,list2.size()-1);
        System.out.println(list2);

        System.out.println("===============================");
        ArrayList<Character>list = new ArrayList<>();
        for(char i = 'a';i<='z'; i++){
            list.add(i);
        }
        System.out.println(list);
        //a, c, D
        boolean result = list.containsAll(Arrays.asList('a','d','D'));
        System.out.println(result);



    }

}

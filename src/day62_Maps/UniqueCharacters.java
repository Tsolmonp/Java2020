package day62_Maps;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "abacdbeefgghijklmmnn";
        Map<String,Integer>map = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split(""));

        for(String each : list ){ //each: abacbdeef
            if(Collections.frequency(list, each)==1){
                map.put(each,1);
            }
        }
        System.out.println(map);

        //verify that J is unique
        System.out.println(map.containsKey("c"));



    }
}
/* 2. write a program that stores the unique characters from a string into a map
         Ex:
         str = "abacbdeef";
         output:
         {c=1, d=1, f=1}
         Map Interface: Key & Value, cannot be primitive
         key MUST be unique
         HashMap (C): does not keep insertion order
         accepts null
         LinkedHashMap (C): keeps the insertion order
         accepts null
         HashTable (C): is synchronized, thread-safe
        does not accept null
        TreeMap (C): sorts the keys
        does not accept nul
*/
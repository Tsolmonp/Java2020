package day61_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IteratingKeysValues {

    public static void main(String[] args) {

        Map<String, LocalDate> students = new LinkedHashMap<>();
            students.put("Hasan", LocalDate.of(1985,4,4));
            students.put("Jesus", LocalDate.of(1979,1,31));
            students.put("Muhtar", LocalDate.of(1985,5,19));
            students.put("Muhtar", LocalDate.of(1965,4,3));
            students.put("John", LocalDate.of(1965,4,3));
            students.put("Murat", LocalDate.of(1965,4,3));

        System.out.println(students);


        for(String each:students.keySet() ){
            System.out.println(each);
        }
        System.out.println("===================================");
         for(LocalDate each: students.values()){
             System.out.println(each);
         }



    }
}

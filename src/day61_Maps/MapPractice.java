package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double> employee = new LinkedHashMap<>();
        employee.put("Elvira", 150000.0);
        employee.put("Ziiadin", 120000.50);
        employee.put("Roman", 130000.0);
        employee.put("Cihan",140000.0);
        employee.put("Nurbiya",120000.0);

        System.out.println(employee);
        System.out.println(employee.size());//returns how many pairs of data

        System.out.println("Salary of Ziiadin: "+ employee.get("Ziiadin"));

        employee.remove("Ziiadin");

        System.out.println(employee);
        System.out.println(employee.size());

        boolean r1 = employee.containsKey("Roman");
        System.out.println(r1);

        boolean r2= employee.containsValue(120000.5);


        System.out.println(r2);

        boolean r3 = employee.containsValue(150000.0);

        System.out.println(r3);

        employee.clear();

        System.out.println(employee);

        System.out.println(employee.isEmpty());

    }
}

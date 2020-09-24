package day57_Polymorphism.EmployeeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {
    public static void main(String[] args) {

        Employee tester1 = new Tester("Andrei",12345567,"QA",120000,'M');
        Employee tester2 = new Tester("Musa Moe",12345568,"SDET",130000,'M');

        Employee developer1 = new Developer("Hajer",123455,"Team Lead",120000,'M');
        Employee developer2 = new Tester("Abdul",1234,"QA",120000,'M');

        //scrum team
        ArrayList<Employee>scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2,developer1,developer2));

        for(Employee each : scrumTeam){
            System.out.println(each);
        }
    }
}

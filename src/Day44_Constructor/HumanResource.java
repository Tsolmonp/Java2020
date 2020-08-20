package Day44_Constructor;

public class HumanResource {
    static Employee employee1;//we can call it from the class name
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    //employee1 = new Employee();
    //employee1 = setEmployeeInfo();
    static { //as soon as the class called, the static variables need to be set
        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();

        employee1.setEmployeeInfo("Muhaned",12341,4554566,"SDET",120000,'M');
        employee2.setEmployeeInfo("Erhen",12342,4554565,"QA",125000,'M');
        employee3.setEmployeeInfo("Asiya",12343,4554564,"SDET",110000,'F');
        employee4.setEmployeeInfo("Ayse",12344,4554563,"instructor",90000,'F');
        employee5.setEmployeeInfo("Ahmed",12345,4554562,"Developer",140000,'M');
    }

}

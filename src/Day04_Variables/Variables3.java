package Day04_Variables;
/*
eclare the following variables:
        String: empName
        int: empID
        String:jTitle
        double: salary
        char: gender(char)
        boolean: isFullTime(boolean)
*/
public class Variables3 {
    public static void main(String[] args) {
        //school name: Cybertek School
        String schoolName = "Cybertek School";
        System.out.println(schoolName);

        String employeeName = "Ts";
        int employeeID = 123;
        String jobTitle = "QA";
        double salary = 100_000.50;
        char gender = 'M';
        boolean isFullTime = false;

        System.out.println("EmployeeName:" + employeeName);
        System.out.println("Employee ID is:"+ employeeID);
        System.out.println("Job Title:" + jobTitle);
        System.out.println("Salary:$" + salary );
        System.out.println("Gender:" + gender );
        System.out.println("Full Time:" + isFullTime);




    }
}

package Day05_ArithmeticOperators;

public class EmployeeInfo2 {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Daniel";
        int age = 36;
        String companyName = "CapitalOne";
        char gender = 'M';
        String jobTitle = "SDET";
        boolean isMarried = true;
        boolean isFullTime = false;
        double salary = 120_000.50;
        String fullName = firstName+" " + lastName;//"Aaron Jones"/double code

        System.out.println("Employee' full name is: " + firstName+ " " + lastName );
        System.out.println( fullName+"'s gender is: " + gender );
        System.out.println(fullName+"'s age is: " +age + " years old");
        System.out.println(fullName+" works at: "+companyName);
        System.out.println(fullName+"'s job title is: " + jobTitle);
        System.out.println(fullName+"'s salary is: $" +salary );
        System.out.println(fullName+" is full time employee: " + isFullTime);
        System.out.println(fullName+" is married: " + isMarried);



    }
}

package day45_Constructor;

public class Paycheck {

    public static void main(String[] args) {

        SalaryCalculator obj1 = new SalaryCalculator(35.42,40,0.07,0.24);
        System.out.println(obj1.salary());
        System.out.println(obj1.salaryAfterTax());
        System.out.println("Total Tax: "+(obj1.salary()-obj1.salaryAfterTax()));




    }
}

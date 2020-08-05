package Day11_NestedIf_Ternary;
/*
            precondition: minimum salary of 30k
                sub condition: minimum 2 years of job history
            1 monday
            2 Tuesday
            3 Wednesday
            ...
            7 Sunday
            invalid ==> there is no such a day
         */

public class NestedIf_Practice {
    public static void main(String[] args) {
      double salary = 29999;
      int jobHistory = 2;

      if(salary >= 30000) {
          if (jobHistory >= 2) {
              System.out.println("You are qualified");
          }else{ //jobHistory < 2
              System.out.println("You must have been on job at least 2 year");
          }
          }else{
          System.out.println("You Must earn at least $30K");

      }
    }
}

package Day29_CustomeMethod;

import Day23_Array.Addition;

public class EligibilityToVote {
    /*
    age, sitizen,name
     */
    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age >= 21){
            System.out.println("You are eligible to buy acohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }
    public static void main(String[] args) {
        vote("John", 28, true,"Biden");
        vote("Daniel", 17,true,"Kanye");
        eligibleToBuyAlcohol(true, 22);
        calculator(100,'/', 2);

    }

    public static void vote(String name,int age, boolean citizen, String candidateName){
        boolean eligibleToVote = age>=18 && citizen == true;
        if(eligibleToVote){
            System.out.println(name+ " is eligible to vote for " + candidateName);
        }else{
            System.out.println(name+ " is note eligible to vote");
        }
    }

    public static void calculator(double num1, char operator, double num2){
        //+, -, *, /, %, invalid
            switch(operator){

                case '+':
                    System.out.println("Addition :"  +(num1 + num2));
                    break;
                case '-':
                    System.out.println("Subtraction :"  +(num1 - num2));
                    break;
                case '*':
                    System.out.println("Multification :"  +(num1 * num2));
                    break;
                case '/':
                    System.out.println("Division :"  +(num1 / num2));
                    break;
                case '%':
                    System.out.println("Reminder :"  +(num1 % num2));
                    break;
                default:
                    System.out.println("Invalid");

            }
    }
}

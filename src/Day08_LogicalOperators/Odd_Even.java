package Day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {
        int number = 1000;
        boolean even = number % 2 ==0;
        boolean odd = !even;

        if (even){
            System.out.println(number+ " is even number");
        if(odd){
            System.out.println("is odd number");
        }

        }

    }
}

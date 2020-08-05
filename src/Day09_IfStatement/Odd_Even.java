package Day09_IfStatement;

public class Odd_Even {
    public static void main(String[] args) {
        int number = 101;

        if (number % 2 != 0) {
            System.out.println("Odd");
        } else {
            if (number % 2 == 0)
                System.out.println("Even");
        }

    }
}
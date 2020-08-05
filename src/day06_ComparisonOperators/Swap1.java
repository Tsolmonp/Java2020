package day06_ComparisonOperators;

public class Swap1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 25;

        int c = b; //c = 25

        b = a; // b = 10
        a = b; // a = 10

        System.out.println(a); // 15
        System.out.println(b); // 10

        b = a; //b = 10
        a = c; // a = 15
        System.out.println(a);





    }
}

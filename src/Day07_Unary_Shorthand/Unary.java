package Day07_Unary_Shorthand;

public class Unary {
    public static void main(String[] args) {


        int a = 20;
        // a = a-1; // 19
        --a;
        System.out.println(a);

        // ++
         int b = 10;
         b = b + 1;
         ++b;
         // b = b + 1;= ++b;
        System.out.println(b);

        int x = 100;
        System.out.println(++x); //101

        int y = 200;
        System.out.println( --y); // 199

        int z = 80;
        System.out.println( ++z); //81
        System.out.println( --z); //80


    }
}

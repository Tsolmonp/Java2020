package Day07_Unary_Shorthand;

public class Post_VD_Pre {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(++x);//11
        System.out.println(x);

        System.out.println("=================================");

        int b = 10;
        System.out.println( b++); //10
        System.out.println(b); //11

        System.out.println("=================================");
        int c = 25;
        int d = c++; //d = 25
        System.out.println(d);
        System.out.println(c);
        System.out.println("==================================");
        int e = 25;
         e++;
        System.out.println(e);
        System.out.println("==================================");
        int p = 8;
        p--;
        int y = p--;
        System.out.println(y);
        System.out.println("=================================");

        int A = 1; //A = 0
        A = -A-- + A++ / -A-- * --A; //A=0
        //A = -1 + 0 / -1 * -1
        //A = -1 + 0 * -1
        //A = -1 + 0 = -1

        System.out.println(A);

        int a = 50; //--a = 49
                    //a++ = 49
                    //a-- = 50
                    //a++ = 49

        a = --a + a++ + a-- + a++; //49 + 49 + 50 + 49
        System.out.println(a);






    }
}

package Day43_Static;

import java.util.Arrays;
import static Library.Resources.a;// only import a
import static Library.Resources.*;
public class Test {
    public static void main(String[] args) {
        System.out.println(staticBlock3.a);
        System.out.println(staticBlock3.b);
        System.out.println(staticBlock3.c);

        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);

        System.out.println("=============================");

        System.out.println(a);

    }
}

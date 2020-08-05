package Day22_NestedLoop;
/*
*
**
***
****
*****
******
*******
******
* ***
* **
* *
*
*/

import java.util.Scanner;

public class Nested_Loop4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int j = 1; j <= n; j++){
            for (int k = 1; j>= k; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println("=============================");
        for(int j = 5; j>=1; j--){
            for(int k=j; k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


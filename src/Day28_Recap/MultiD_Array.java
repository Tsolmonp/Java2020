package Day28_Recap;

import java.util.Arrays;

public class MultiD_Array {

    public static void main(String[] args) {
        int[] arr1D = {1, 2, 3};
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11}};
        //                0  1 3   0 1 2 3 4   0  1  2
        //                   0          1           2

        System.out.println(Arrays.toString(arr2D[0]));  // single dimensional array
        System.out.println(Arrays.deepToString(arr2D));
        //7
        System.out.println(arr2D[1][3]);
        System.out.println("+========================");
        for (int i = 0; i <= arr2D.length - 1; i++) {
            int[] each1DArray = arr2D[i];
            //System.out.println(each1DArray);
            for (int j = 0; j <= each1DArray.length - 1; j++) {
                int eachNum = each1DArray[j];
                if (eachNum % 2 != 0) {
                    System.out.print(eachNum + " ");
                }
            }
            System.out.println();
        }
        System.out.println("============================");
        for (int[] each1D : arr2D) {
            for(int eachElement :each1D){
                if(eachElement%2 !=0)
                System.out.print(eachElement);
            }
            System.out.println();
        }

    }

}
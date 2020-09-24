package Day0;

import java.util.Arrays;

public class PracticeMentor {

    public static void main(String[] args) {
        int[] arr={55,-5,0,26};
        int max = arr[0];
        int l=arr.length;
        for (int i=1; i<=l-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println("========================");


    }
    public static int getLargest(int[]nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }

}

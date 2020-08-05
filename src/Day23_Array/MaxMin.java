package Day23_Array;

public class MaxMin {

    public static void main(String[] args) {

        int[] arr = {5, 5, 4, 6, 8, -300, -3000};
        int max = arr[0];// max value is 5
        int min = arr[0];

        for(int i = 1; i <= arr.length-1; i++){
            if(arr[i]> max) {//compares the array' elements,
                // and assign the maximum number to variable max
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }

        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);
    }
}

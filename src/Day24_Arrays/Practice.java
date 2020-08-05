package Day24_Arrays;

public class Practice {
    public static void main(String[] args) {


        String[] arr = {"Muhtar", "Saim", "Asiya"};

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }

        System.out.println();
        System.out.println("=================================");

        for (String each : arr) {//each represents the elements
            System.out.print(each + " ");
        }
    }
}
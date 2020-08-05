package Office_Hours.Practice_07_14_2020;

public class UniqueNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 5, 6, 7,8,9};

        for (int b : arr) {


            int num = arr[0];
            int count = 0;
            for (int each : arr) {
                if (each == b) {
                    count++;

                }

            }
            if (count == 1) {
                System.out.println(b);
            }


        }
    }
}
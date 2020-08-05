package Day29_CustomeMethod;

public class MaxMIn {

    public static void main(String[] args) {
        int[] numbers = {10, 9, 111, 200000, 10, 20, -100};
        maxNum(numbers);
        minNum(numbers);
    }

    public static void maxNum(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println("Max: " + max);
    }

    public static void minNum(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Min: " + min);
    }
}
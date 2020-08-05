package Day24_Arrays;

public class UniquesNumbers2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 5, 3, 3, 6, 7, 8, 9, 9};

        for (int a : arr) {

            int count = 0;

            for (int b : arr) {

                if (b == a) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a + " ");
            }
        }
    }
}
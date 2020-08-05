package Day11_NestedIf_Ternary;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int month = 2;
        boolean validNumber = month >= 1 && month <= 12;

        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 11;

        String result = "";

        if (validNumber) {//for 28 days or 30 days or 31 days
            if (days28) {
                result = "28 Days";

            } else if (days30) {
                result = "30days";

            } else {
                result = "31days";
            }
        } else {//Invalid Month
            result = "Invalid";

        }
        System.out.println(result);
    }
}
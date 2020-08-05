package Day12_Switch_Scanner;

public class Switch_Practice1 {
    public static void main(String[] args) {
        int num = 7;
        String result ="";
        switch(num) {
            case 1:
                result = "Monday";
                //System.out.println("Monday");
                break;


            case 2:
                result = "Tuesday";//System.out.println("Monday");
                break;

            case 3:
                result = "Wednesday";//System.out.println("Monday");
                break;

            case 4:
                result = "Thursday";//System.out.println("Tuesday");
                break;

            case 5:
                result = "Friday";//System.out.println("Friday");
                break;

            case 6:
                result = "Saturday";//System.out.println(Saturday");
                break;

            case 7:
                result = "Sunday";//System.out.println("Sunday");
                break;


            default:
                result = "Invalid";//System.out.println("Invalid");

        }
            System.out.println(result);


    }
}

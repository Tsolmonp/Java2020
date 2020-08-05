package Day12_Switch_Scanner;

public class SwichScanner {
    public static void main(String[] args) {
        double n1 = 100;
        double n2 = 200;
        double n3 = 300;

        boolean n1IsBigger = n1 > n2 && n1 > n3;
        //if || use           true || false ==> true
        boolean n2IsBigger = n2 > n1 && n2 > n3;
        //n1IsBigger == false && n2 >n3;
        boolean n3IsBigger = !n1IsBigger && n2IsBigger;
        String result = "";
/*
        if (n1IsBigger) {
            result = "n1 is bigger";
        } else if (n2IsBigger) {
            result = "n2 is bigger";
        } else {//if n3 is the biggest number
            result = "n3 is bigger";
        }

 */
        result = (n1IsBigger) ? "n1 is bigger" : (n2IsBigger) ? "n2 is bigger" : "n3 is bigger";

        System.out.println(result);
    }

}
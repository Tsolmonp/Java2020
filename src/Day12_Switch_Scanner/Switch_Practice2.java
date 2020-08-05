package Day12_Switch_Scanner;

public class Switch_Practice2 {
    public static void main(String[] args) {
        String productName = "iPad";

        switch(productName){
            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iphone":
            case "ipad":
            case"MacBook":
                System.out.println("Apple");
                break;
        }
    }
}

package Office_Hours.Practice_09_16_2020;

public class ThrowKeyword {
    public static void main(String[] args) {
        String browser = "cybertek";

        if (!browser.equals("chrome")){
            throw new RuntimeException();
        }
        System.out.println("Test started on: "+browser+" browser");
    }
}

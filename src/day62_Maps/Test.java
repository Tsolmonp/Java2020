package day62_Maps;

public class Test {
    public static void main(String[] args) {
       // String favoriteColor = "Pink";
        Color favoriteColor = Color.White;

        System.out.println(favoriteColor);

        Browser browserName=Browser.chrome;
        switch(browserName){
            case chrome:
                System.out.println("Chrome browser is set");
            case firefox:
                System.out.println("Firefox browser is set");
            case safari:
                System.out.println("Safari browser is set");
            case edge:
                System.out.println("Edge browser is set");
        }

        System.out.println("===========================");

        WeekDays day = WeekDays.Monday;
        WeekDays day2 = WeekDays.Tuesday;
        WeekDays day3 = WeekDays.Wednesday;

        Month month1 = Month.April;
        Month month3 = Month.May;
        Month month2 = Month.March;

        Level level1 = Level.Low;
        Level level2 = Level.Medium;
        Level level3 = Level.High;

    }
}

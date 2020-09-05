package day51_Exceptions.BrowserTasks;

public class WebDriver {

    public void get(String url) {
        System.out.println("Opening the " +url + " in default browser");
    }
    public void close(){
        System.out.println("closing the default browser");

    }
}

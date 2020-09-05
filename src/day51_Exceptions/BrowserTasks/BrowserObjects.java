package day51_Exceptions.BrowserTasks;

public class BrowserObjects {
    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("https://www.google.com/");
        chrome.close();

        System.out.println("============================");
        FireFoxBrowser fireFox = new FireFoxBrowser();
        fireFox.get("https://www.google.com/");
        fireFox.close();

        System.out.println("============================");
        OperaBrowser opera = new OperaBrowser();
        opera.get("https://www.google.com/");
        opera.close();

    }
}

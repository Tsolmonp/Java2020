package day51_Exceptions.BrowserTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
1. create a class called WebDriver
            actions: get(URL): prints "opening the URL in the default browser"
                     close(): closes the default browser
 */
public class ChromeBrowser extends  WebDriver {
    /*
    get(Url).get
     */
   public void get (String url){
        System.out.println("Opening the " +url + " in default browser");
    }
   public void close(){
        System.out.println("closing the default browser");
    }
}

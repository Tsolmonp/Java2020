package Office_Hours.Practice_09_16_2020;

import java.io.FileInputStream;

public class ThrowsKeyword2 {

    public static void main(String[] args)throws InterruptedException {
        System.out.println(9/0);//must occure during runtime
      Thread.sleep(3000);//must occure during complete time
        System.out.println("Completed");

        //new FileInputStream("");
    }
}

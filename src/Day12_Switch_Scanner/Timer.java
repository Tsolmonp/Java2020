package Day12_Switch_Scanner;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args)throws Exception {

        Scanner scan = new Scanner(System.in);
        int minutes = scan.nextInt();
        for(int i = minutes; i > 0; --i){
            if(i<0)
                break;
            for(int z = 59; z >= 0; --z){
                System.out.println((i-1)+ " minutes and " +z+" seconds left" );
                Thread.sleep(1000);
            }
        }

    }
}

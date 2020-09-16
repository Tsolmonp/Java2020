package Office_Hours.Practice_09_16_2020;
import java.lang.Exception;
import java.util.NoSuchElementException;

public class ExceptionTypes {

    public static void main(String[] args) {

        //Thread.sleep();
        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            System.out.println("Arithmetic exception is caught: " + e.getMessage());

        }
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("catch block1 handled it");
        } catch (Exception e) {
            System.out.println("catch block2 handled it");
        }

        int[] arr = {1,2,3};
        try{
            System.out.println(arr[25]);
        }catch(ClassCastException e) {
            System.out.println("Class Cast Exception is handled: " + e.getMessage());
        }finally{
            System.out.println("Finally Completed");
        }
        System.out.println("Test Case 1 completed");

        try{
            System.out.println(9/0);

        }catch(ClassCastException e){
            System.out.println("class cast exception is handled");
        }catch(NoSuchElementException e){
            System.out.println("No such element exception is handled");
        }catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException is handled");
        }catch(RuntimeException e){
            System.out.println("Runtime exception is handled");

        }finally{
            System.out.println("finally block");
        }
        //Thread.sleep(3000);

    }
}
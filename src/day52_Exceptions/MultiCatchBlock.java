package day52_Exceptions;


import java.util.NoSuchElementException;

public class MultiCatchBlock {
    public static void main(String[] args) {


        int[] arr = {10, 20};

        try {
            System.out.println(arr[20]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception is handled");
        } catch (ClassCastException e) {
            System.out.println("Class Cast Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bound Eception");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bound Eception");
        } catch (RuntimeException e) {
            System.out.println("Run Time Exception");
        }//catch(NoSuchElementException e){
        System.out.println("================================");

        String str = "Cybertek";

        try {
            System.out.println(str.charAt(200));
        } catch (IndexOutOfBoundsException e) {//}catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("==========================");
        try {
            System.out.println(8/0);
            System.out.println("Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
        }finally{
            System.out.println("Finally Block");
        }
        System.out.println("Completed");
    }
}
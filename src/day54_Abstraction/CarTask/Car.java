package day54_Abstraction.CarTask;
/*Ex2
        car
        BMW
        start(): push start button
        Tesla
        start(): voice control
        Toyota
        start(): insert the key
        Jeep
        start(): jump start
 */

public abstract class Car {

    public Car(){}

   public abstract void start();

}
final class A{//can final

}
class B{
    public static void main(String[] args) {
        A obj1 = new A();

    }

}
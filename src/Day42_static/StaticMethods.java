package Day42_static;

public class StaticMethods {

    int a = 200;
    static int b = 400;

    public static void main(String[] args) {
        System.out.println(b);
        //System.out.println(a);

        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);
            //the ONLY WAY to call instances in a static method

        staticMethod();
        StaticMethods.staticMethod();
        //instanceMethod();
        obj.instanceMethod();

    }
    public static void staticMethod(){

    }
    public void instanceMethod(){

    }
}

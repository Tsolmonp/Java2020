package day51_Exceptions;
class C{
    public C(int a){
        System.out.println("Super class' default constructor");
    }
}

public class SuperKeyword3 extends C{//sub class has to a from super class
    public SuperKeyword3(int a){
        super(100); //
        System.out.println("Sub class' constructor with int arg");

    }


    public static void main(String[] args) {
        new SuperKeyword3(100);

    }





    /*
    public void method(){
        super(300);
    }
    */
    }

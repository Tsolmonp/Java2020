package day48_Inheritance.DeviceTask;
 /*
    Inherited:
        variables: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize
        methods: setInfo, toString
     */

/*
we do not have yet:
    variables: remoteControl
    methods: watch
 */
public class TV extends Device{
    /*
    Inherited:
    variables: brand, model,price,MadeIn, hasBattery,hasMemory,screenSize
    methods:setInfo, toString

     */
    public  boolean hasRemoteControl;




    public TV(String brand, String model, double price, String screenSize, boolean hasBattery, boolean hasMemory, boolean hasRemoteControl){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.hasRemoteControl = hasRemoteControl;

    }

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }

}

package Office_Hours.Practice_09_09_2020;

public class Iphone extends Phone{
    /*
    variables: 4
    methods:3
     */
    public Iphone(String model, double price){
        super(model, price);
    }
    static {
        brand = "iPhone";
        madeIn = "USA";
    }
    public void call(long phoneNumber){
        System.out.println("iPhone "+model+"is calling: "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("iPhone "+model+"is texting: "+phoneNumber);
    }
}

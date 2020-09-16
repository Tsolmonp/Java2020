package Office_Hours.Practice_09_09_2020;
/*
Phone: brand, price, madeIn,call(), text()
static: brand, madeIn
instance: model, price,call(), text()

Samsung: brand, price, madeIn,call(), text(), toString

Iphone: brand, price, madeIn,call(), text(), toString

Nokia:	brand, price, madeIn,call(), text(), toString

overriding: one method diff-t implementation

 */
public class Phone {

    public static String brand;
    public static String madeIn;

    public String model;
    public double price;
    public boolean isTouchScreen;

    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }
    public void call(long phoneNumber){
        System.out.println("Phone is calling: " +phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Phone is texting to: " +phoneNumber);
    }

    @Override
    public String toString() {
        return "Brand: "+brand+"\nModel: "+model+"\nPrice: $"+price+"\nMade in: "+madeIn;

    }
}
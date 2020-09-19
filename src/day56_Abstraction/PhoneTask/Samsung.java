package day56_Abstraction.PhoneTask;

public class Samsung extends  Phone {

    public Samsung(String brand, String model, double price, String size) {
        super(brand, model, price, size);
        if(price <= 0 || price > 1200){
            throw new RuntimeException("Invalid Price: "+price);

        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}

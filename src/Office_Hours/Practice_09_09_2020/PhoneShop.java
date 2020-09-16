package Office_Hours.Practice_09_09_2020;

public class PhoneShop { // PhoneShop HAS An relation

    public static void main(String[] args) {

        Iphone iphone = new Iphone("11 Pro",1200);

        iphone.call(911);
        iphone.text(13246789);

        System.out.println(iphone);

        System.out.println("==============================");

        Samsung samsung = new Samsung("Galaxy Note20",799.9 );

        System.out.println(samsung);
        samsung.call(12345);
        samsung.text(12345678);

        System.out.println("=================================");

        Nokia nokia = new Nokia("Finland", 25);

        System.out.println(nokia);

        nokia.call(346789);
        nokia.text(346789);
    }
}

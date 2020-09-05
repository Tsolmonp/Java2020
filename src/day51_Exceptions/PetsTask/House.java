package day51_Exceptions.PetsTask;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Juno","Husky",'F',8,"white");

        System.out.println(dog1.name);

        System.out.println(dog1);

        Cat cat1 = new Cat("Sisi","Sweden",'F',8,"white");

        System.out.println(cat1);
        Tiger tiger1 = new Tiger("Sassy","Sweden",'F',8,"white");

        System.out.println(tiger1);

        tiger1.eat();
        tiger1.drink();
    }
}

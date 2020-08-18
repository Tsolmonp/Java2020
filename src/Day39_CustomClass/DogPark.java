package Day39_CustomClass;

public class DogPark {

    public static void main(String[] args) {
        //dogPark
        Dog dog1 = new Dog();
        Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        //                   0        1          2          3          4

        dogPark[0].setDogInfo("Archie", "husky", "Big", 5, "White");
        dogPark[1].setDogInfo("Archie", "husky", "Big", 5, "Brown");
        dogPark[2].setDogInfo("Archie", "husky", "Big", 5, "Grey");
        dogPark[3].setDogInfo("Archie", "husky", "Big", 5, "Spotted");
        dogPark[4].setDogInfo("Archie", "husky", "Big", 5, "Yellow");


        for (int i = 0; i <= dogPark.length - 1; i++) {
            dogPark[i].getDogInfo();
        }
        System.out.println("============================================================");

        for (Dog eachDog : dogPark) {
            eachDog.getDogInfo();
        }
        System.out.println("==============================================================");
        String food = "treats";
        for (Dog eachDog : dogPark) {
            eachDog.eat(food);
        }

        System.out.println("=====================================================");
        String drink = "milk";
        for (Dog eachDog : dogPark) {
            eachDog.drink(drink);
        }

        System.out.println("====================================================");
        // play
        for (Dog eachDog : dogPark) {
            eachDog.play();
        }

        System.out.println("====================================================");
        // sleep
        for (Dog eachDog : dogPark) {
            eachDog.sleep();
        }

    }
}
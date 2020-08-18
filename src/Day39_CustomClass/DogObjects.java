package Day39_CustomClass;

public class DogObjects {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Archie","husky","big",2,"Black");
        dog2.setDogInfo("Juno","husky","big",8,"White");
        dog3.setDogInfo("Hershey","Pomerenian","small",2,"Black");



        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

         dog1.eat("Fish");
         dog2.eat("Steak");
         dog3.eat("Fish");

         dog3.drink("Coke");
         dog1.drink("Milk");
         dog2.drink("Water");

         dog1.sleep();
         dog2.sleep();
         dog3.sleep();

         dog1.food();
         dog2.food();
         dog3.food();

         dog3.drink();
         dog2.drink();

         dog1.play();
         dog2.play();

         dog2.sleep();
         dog3.sleep();








    }
}

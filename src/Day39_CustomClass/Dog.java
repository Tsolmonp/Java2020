package Day39_CustomClass;

public class Dog {
    /*
    instance variables:
        breed,size, age,color
    instance methods:
        setDogInfo,getDogInfo,eat,drink sleep, bark, ....
     */
    String name;
    String breed;
    String size;
    int age;
    String color;

    public void setDogInfo(String dogName,String dogBreed, String dogSize,int dogAge,String dogColor){
        name = dogName;
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
    }
    //sets the info of the dog

    public void getDogInfo(){
        System.out.println("Name: "+name+", Breed: "+breed+", Size: "+size+",Color: "+color+",Age:"+age+" years old");
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);

    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void play(){
        System.out.println(name+" is playing");
    }
    public void food(){
        System.out.println(name+" is eating treats");
    }
    public void drink(){
        System.out.println(name+" is drinking milk");
    }
    /*
    dog1: husky
    dog2:pitbull
    dog3:golden retriever
     */


}

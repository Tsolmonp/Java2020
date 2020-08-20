package Day44_Constructor;
/* declar: Access-Modifier className(){
        statements;
  }

 */
public class ConstructorIntro {

   public ConstructorIntro(String arr){
       System.out.println("Hello "+arr);
       System.out.println("How are you "+arr);

    }
   // public ConstructorIntro(String a){



    public static void main(String[] args) {

        //ConstructorIntro obj = new ConstructorIntro(10);
        //ConstructorIntro obj2 = new ConstructorIntro();
        ConstructorIntro obj3 = new ConstructorIntro("Archie");
        ConstructorIntro obj4 = new ConstructorIntro("Muhtar");
        ConstructorIntro obj5 = new ConstructorIntro("Zeliha");

    }
}

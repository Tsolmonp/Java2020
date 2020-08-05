package Day16_String;



public class String_Methods2 {
    public static void main(String[] args) {
     String name1 = "Cybertek";

     String name2 = "";

        System.out.println(name1.isEmpty());
        System.out.println(name2.isEmpty());

        String str1 = "Java";//String pool
        String str2 = new String("Java");//heap

        System.out.println(str1+ " :" +str2);
        System.out.println(str2 == str1);//false

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3 == str4);//false
        System.out.println(str3.equals(str4));//true

        String str5 = "Java";
        String str6 = "Java";

        System.out.println( str5 == str6);//true

        String str7 = "JAVA";
        String str8 = "java";

        System.out.println(str7 == str8);//true

        //yes,YES,yes,==> ignore


        System.out.println(str7.equalsIgnoreCase(str8));

        //contains
        String str = "I like to learn java programming Language";

        System.out.println(str.contains("python"));
        System.out.println(!str.contains("python"));

        System.out.println(str.contains("java"));
        System.out.println(str.contains("Java"));

        // startsWith();
        String s1 = "Tsolmon";
        System.out.println(s1.startsWith("Ts"));//true
        System.out.println(s1.endsWith("n"));//true

        System.out.println(s1.toLowerCase());


    }

}

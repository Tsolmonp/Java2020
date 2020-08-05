package Day16_String;

public class String_Methods {

    public static void main(String[] args) {

        String email = "cybertek@gmail.com";

        char target;
        email = email.replace("Java","C#");
        System.out.println(email);
        String word = "java";
            word.replace("a", "e");

        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, java is fun";
        sentence = sentence.replace("a, Java", "C#");

        sentence.replace("Java ", "Python ");

        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place"; //MIT

        s1 = s1.replace("Cybertek", "MIT");

        System.out.println(s1);
        s1 = s1.replace("MIT", "Cybertek");

        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java";

        s2 = s2.replace('R', 'r');
        System.out.println(s2);


    }
}

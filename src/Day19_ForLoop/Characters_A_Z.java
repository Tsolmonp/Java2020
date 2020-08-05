package Day19_ForLoop;

public class Characters_A_Z {
    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();

        for (char i = 65; i <= 90; i++) {
            char ch = (char) i;
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("=================================");
        //task06:
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.println(ch + " ");
        }
        System.out.println();
        for (int i = 90; i >= 65; i--) {
            System.out.println((char) i + " ");
        }
        System.out.println();

        System.out.println("=================================");

      /*  for (int i = 0; i < 65536; i++) {
            System.out.println((char) i + " ");

        }

       */
    }
}
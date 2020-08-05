package Day29_CustomeMethod;

public class PalindromeTest {
    /*
    kayak ==> kayak true
    Java==> avaj false
     */
    public static void main(String[] args) {
        palindrome("kayak");

    }
    public static void palindrome(String word){
        String reversed = "";
        for (int i = word.length()-1; i>=0;i--){
            reversed += word.charAt(i);

        }
        System.out.println(reversed.equalsIgnoreCase(word));
    }


}

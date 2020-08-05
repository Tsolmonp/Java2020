package day03_sequences_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class EscapeSequences {
    public static void main(String[] args){
        System.out.println("Hello Everyone \nMy name is Cybertek");
        System.out.println("\tI am in Virginia\n");
        System.out.println("\t\t\t\n\nI love programming");

        System.out.println("\\");//this prints me one back slash
        System.out.println("/"); //this prints me one forward slash

        System.out.println("\\\\");//this prints me 2 back slash
        System.out.println("//"); //this prints me two forward slash

        System.out.println("My name is \'Tsolmon\'");
        System.out.println("My name is 'Tsolmon'");

        System.out.println("My favorite TV-series: \"Game of thrones\"");

    }

}
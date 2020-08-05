package Day19_ForLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // i: 1,2,3,4,5

            if (i == 3) {
                continue;//jumps to the next iteration
            }

            System.out.println(i + " ");//1,2, 4, 5

        }

        System.out.println("============================");

        for (char ch = 'A'; ch <= 'F'; ch++) {

            if (ch == 'C' || ch == 'F') {
                continue;
            }
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("===================================");

        for(int i = 1; i <= 50; i += 2 ){
                System.out.print(i + " ");
            }
        }



    }



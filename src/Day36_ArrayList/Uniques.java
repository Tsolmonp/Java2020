package Day36_ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Uniques {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();//2

        for (int i = 0; i <= list.size() - 1; i++) {


            Integer element = list.get(i);
            int count = 0;
            for (Integer each : list) {
                if (each == element) {
                    count++;

                }
            }
            if (count == 1) {
                uniques.add(element);
            }
        }
        System.out.println(uniques);

    }
}




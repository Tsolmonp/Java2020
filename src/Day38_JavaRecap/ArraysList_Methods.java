package Day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_Methods {
    //remove, size, set, get,equals,contains,clear
    public static void main(String[] args) {

        ArrayList<String>cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","aammdd","Mercedes","Infinity","Tesla","WV","Lamborghini","Lexus","Tesla","Tesla"));
        //                           0        1         2         3     4        5          6

       // cars.removeAll(Arrays.asList("Tesla"));

        //cars.remove(3);
        //cars.remove("Tesla");
        //cars.removeAll(Arrays.assList("Tesla"));
        //cars.removeIf(p->p.toLowerCase().contains("m"));
        //cars.retainAll(Arrays.asList("Tesla"));
        System.out.println(cars);
        System.out.println("--------------------------------------");

        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "Milk", "Paper Towels", "Toilet Paper", "Mango", "Orange", "Avocado", "Dragon Fruit"));

        //one item
        boolean r1 = groceryList.contains("Eggs");
        System.out.println(r1);


        //Eggs,Milk,Orange;more than 1 items check
        boolean r2 =groceryList.containsAll(Arrays.asList("Eggs","Orange","Milk","water"));
        System.out.println(r2);

        // size method:
        System.out.println("Total Number of items: "+groceryList.size());

        // set the dragon fruit to apple:

        // set the dragon fruit to apple:
        groceryList.set(groceryList.size()-1 ,  "Apple" );
        groceryList.set( groceryList.indexOf("Paper Towels") ,  "Dish Washer");

        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList);







    }
}

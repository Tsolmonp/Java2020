package Day23_Array;

import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        String[]shoppingList=new String[7];

        shoppingList[0] = "Toilet Paper";
        shoppingList[1] = "Hand Sanitizer";
        shoppingList[2] ="Eggs";
        shoppingList[3] =" Corona Beer";
        shoppingList[4] = "Bread";
        shoppingList[5]= "Milk";
        shoppingList[6]= "Warter";

        for(int i = 0; i <= shoppingList.length-7; i++){
            System.out.println(Arrays.toString(shoppingList));
        }
    }
}

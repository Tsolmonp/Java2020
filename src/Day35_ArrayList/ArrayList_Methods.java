package Day35_ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
                earlyBirdList.add("Ibrahim");
                earlyBirdList.add("Virginia");
                earlyBirdList.add("Ziidan");
                earlyBirdList.add("Erfan");
                earlyBirdList.add("Aalin");

            earlyBirdList.set(2,"Aslan");
            earlyBirdList.set(0, "Lan");

        System.out.println(earlyBirdList);
        earlyBirdList.clear();
        System.out.println(earlyBirdList.size());
        System.out.println("================================");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3
        list.add(5);//4

        list.remove(2); //[1.2.3.4.5]
        //list.remove(4);
        list.remove(3);

        System.out.println(list);
        System.out.println("===========================================");
        //remove(Element)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);  //0
        list2.add(2);  //1
        list2.add(3);  //2
        list2.add(4);  //3
        list2.add(5); // 4

        // int a = 1; // [1, 3, 4, 5]

        Integer a = 1; //[2, 3, 4, 5]

        list2.remove(a);

        System.out.println(list2);
        System.out.println("=====================================");
        ArrayList<String> list3 = new ArrayList<>();
                    list3.add("Hamit"); //0
                    list3.add("Lilian");//1
                    list3.add("Bulnet");//2
                    list3.add("Viorel");//3
                    list3.add("Musa");  //4

                //list3.remove(3);
        boolean r = list3.remove("bulnet");
        list3.remove("Bulnet");
        System.out.println(list3);
        System.out.println(r);
    }
}

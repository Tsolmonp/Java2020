package Day36_ArrayList;

import java.util.ArrayList;

public class Set_Method {
    /*

     */
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);//0
        list1.add(10);//1
        list1.add(10);//2
        list1.add(50);//3
        list1.add(60);//4
        list1.add(10);//5
        list1.add(10);//6
        list1.add(10);//7

        list1.set(list1.size()-3,0);
        list1.set(list1.size()-0,8);
        System.out.println(list1);

        System.out.println("==============================");

        ArrayList<Integer>list2= new ArrayList<>();

        for(int i=1; i<=20; i++){
            list2.add(i);
        }
        System.out.println(list2);

        //task2

        for(int i=0; i<=list2.size()-1;i++){
            Integer each = list2.get(i);

            if( each %2 !=0){
                list2.set(i, each *2);

            }else{
                list2.set(i,each*3);
            }
        }
        System.out.println(list2);
    }
}

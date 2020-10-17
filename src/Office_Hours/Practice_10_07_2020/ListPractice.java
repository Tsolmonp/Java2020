package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("Nurbiye", "Emine","Dawud","Emine"));
            // index:                 0         1       2        3
        System.out.println(list);
        System.out.println(list.get(2));

        Stack<String> stack = new Stack<>();
        stack.addAll(list);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop();
    }
}

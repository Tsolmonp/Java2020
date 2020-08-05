package Day21_WhileLoop;

public class DoWhile_Practice {

    public static void main(String[] args) {

        int num = 1;

        do{

            System.out.print(num + " ");

            num++;
        }while(num > 20);

        System.out.println(num);

        System.out.println("====================================");

        char ch = 'Z';
        do{
            System.out.print(ch+" ");
            ch--;
        }while(ch >= 'A');

        System.out.println();



    }
}

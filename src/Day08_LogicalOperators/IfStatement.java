package Day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {
      int b = 1000;
      int a = 1000;
        System.out.println(a+"  is the larger number");

        if(a>b){
            System.out.println(a+" is the larger number");
        }
        if(b > a){
            System.out.println(b+ " is the max number");
        }
        if(a == b){
            System.out.println("Both equal");
        }
        System.out.println("============================");
        boolean BreakTime = true;

        if(BreakTime == true) {
            System.out.println("Take 15 minutes break!");
        }
        if(BreakTime == false){}
            System.out.println("Keep studying");


        boolean corona = true;
        if(corona == true){
            System.out.println("Stay at home");
            System.out.println("Buy more food");
            System.out.println("Social Distance");


        }
    }
}

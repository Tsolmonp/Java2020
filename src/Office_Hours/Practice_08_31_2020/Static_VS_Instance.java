package Office_Hours.Practice_08_31_2020;

public class Static_VS_Instance {
    int insVariable;
    static int staticVariable;

    public static void main(String[] args) {
        System.out.println(staticVariable);
        //System.out.println(insVariable);//static only accepts static

        Static_VS_Instance obj = new Static_VS_Instance();//0

        System.out.println("===============================");

        Static_VS_Instance obj1 = new Static_VS_Instance();

                obj1.insVariable =100;
                obj1.staticVariable =200;
        Static_VS_Instance obj2 = new Static_VS_Instance();

        System.out.println(obj1.insVariable);//100
        System.out.println(obj1.staticVariable);//200

        System.out.println(obj2.insVariable);//0
        System.out.println(obj2.staticVariable);//200

        System.out.println(Static_VS_Instance.staticVariable);//prefered
    }
    public void method1(){
        System.out.println(insVariable);
        System.out.println(staticVariable);
    }
}

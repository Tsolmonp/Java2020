package Library;

import day50_Inheritance_Overriding.AccessModifiers;

public class InheritanceTest extends AccessModifiers {

    public static void main(String[] args) {
        System.out.println(InheritanceTest.publicData); //visible outside
        System.out.println(InheritanceTest.protectedData);//visible always
       // System.out.println(InheritanceTest.defaultData);//not visible
    }
}

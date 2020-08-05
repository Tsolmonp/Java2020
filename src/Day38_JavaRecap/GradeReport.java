package Day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(100,90,97,95,80,83,88,70,77,78,76,60,67,68,50,47,45,34));
        System.out.println(list);

        ArrayList<Integer>gradeA = new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf(each-> each < 90);
        System.out.println("Grade A: "+gradeA);

        ArrayList<Integer> gradeB =new ArrayList<>();//80~89
        gradeB.addAll(list);
        gradeB.removeIf(p-> p < 80||p>89);
        System.out.println("Grade B: "+gradeB);

        ArrayList<Integer>gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(p-> p < 70||p>79);
        System.out.println("Grade C: "+gradeC);

        ArrayList<Integer> gradeD =new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(p-> p < 60||p>69);
        System.out.println("Grade D: "+gradeD);

        ArrayList<Integer>gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        gradeF.removeIf(p->p<0||p>59);

        System.out.println("Grade F: "+gradeF);
        System.out.println("===============================");
        System.out.println(gradeA.size()+" students made A");
        System.out.println(gradeB.size()+" students made B");
        System.out.println(gradeC.size()+" students made C");
        System.out.println(gradeD.size()+" students made D");
        System.out.println(gradeF.size()+" students failed");
    }
}

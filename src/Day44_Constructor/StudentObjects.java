package Day44_Constructor;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Meerin",20,'F');
        //student1.setInfo("Mike",18,'M');
        Student student2 = new Student("Nikolas",28,'M');
       // student2.setInfo("Rakhat",20,'F');
        Student student3 = new Student("Murat",21,'M');
        // student3.setInfo("Asiya",18,'M');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}

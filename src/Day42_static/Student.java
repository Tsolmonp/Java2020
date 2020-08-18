package Day42_static;

public class Student {

    String name;
    int age;
    int groupName;
    char gender;

    static String schoolName = "Cybertek School";
    static String favoriteTeacher = "Nadir";

    public void setInfo(String name,int age,int groupName,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.groupName = groupName;

    }

    public String toString(){//instance method

        return "School name: "+schoolName+"\nStudent name: "+name;
        //                    static variable                instance variable
    }



}

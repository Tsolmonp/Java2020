package Day41_toString;

public class Developer {

    String name;
    double salary;
    String gender;
    int age;
    public  void setInfo(String name, double salary,String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixBugs(){
        System.out.println(name+" is crying");}

        public  String toString(){
            return "Name: "+name+",gender: "+gender+", Age: "+age;


    }
}



class DeveloperObject{

    public static void main(String[] args) {

        Developer[] developers = {new Developer(), new Developer(),new Developer(),new Developer(),new Developer()};

        developers[0].setInfo("Ahmed", 125000,"Male", 30);
        developers[1].setInfo("Erfan", 125000,"Male", 30);
        developers[2].setInfo("Arpat", 125000,"Male", 32);
        developers[3].setInfo("Ajit", 125000,"Male", 30);
        developers[4].setInfo("Ahmed", 120000,"Male", 31);

        for (Developer each : developers){
            each.coding();
        }

        System.out.println("======================================");
        for(int i=0; i<= developers.length-1; i++){
            developers[i].fixBugs();
            developers[i].coding();
        }
    }
}
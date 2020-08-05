package Day20_WhileLoops;

import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        int age = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";

        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your Name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String driverLicense= scan.nextLine();
        if(driverLicense.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
            System.out.println("Enter your zip code");

        }
        int zipCode = scan.nextInt();
        if(zipCode == 20910 || zipCode==20740){
            premium += 60;
        }else if(zipCode == 22102 || zipCode==22103){
            premium+=30;
        }else{
            premium+= 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");

        vehicleOwnership=scan.next();
        if(vehicleOwnership.equalsIgnoreCase("Owned")){
            premium +=10;
        }else{
            premium +=20;
        }
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if(vehicleUsage.equalsIgnoreCase("Business")){
            premium += 50;
        }else if(vehicleUsage.equalsIgnoreCase("Pleasure")){
            premium += 10;
        }else{
            premium += 20;
        }
        System.out.println("Days Driven To Work And/Or School");

        daysDrivenToWorkOrSchool = scan.nextInt();
        premium += daysDrivenToWorkOrSchool*5;

        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool=scan.nextInt();
        premium += milesToWorkOrSchool*1;


        System.out.println("How old are you?");
        age = scan.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if(age>16 && age<18){
            premium *=20;
        }else if(age>=18 && age<=21){
            premium *= 6;
        }else if(age >21 && age<25){
            premium *=2;
        }

        System.out.println("How many years you've been driving?");
        int drivingExp = scan.nextInt();
        int result = age-drivingExp;
        if(!(drivingExp >0 && result>16)){
            System.exit(0);
        }else{
            premium=premium-(drivingExp*5);
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String answer =scan.next();

        if(!answer.equalsIgnoreCase("Yes")){

            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium=(premium*0.2)*accidentsAmount+premium;

        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if(!(continuousInsurance.equalsIgnoreCase("yes")))
            premium=premium+premium;
        System.out.println("What is the highest level of education you have completed?");
        scan.nextLine();
        education=scan.nextLine();
        if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters"))
            premium=premium-(premium*0.05);
        if(education.equalsIgnoreCase("Doctors"))
            premium=premium-(premium*0.10);
        if(education.equalsIgnoreCase("Less than High School"))
            premium=premium+(premium*0.05);
        System.out.println(name+" customer, here's your quote!");
        System.out.println("Start Your Policy Today For: $" +premium);
        int nameletter = name.length();
        System.out.println("Reference number: " +name.toUpperCase().substring(0,1)+name.toUpperCase().substring(1,2)+
                " "+age+" "+name.toUpperCase().substring(nameletter-2, nameletter)+zipCode+ " "
                +education.toUpperCase().replace(" "," "));

    }
}




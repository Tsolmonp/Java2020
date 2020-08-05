package Day04_Variables;
/*
Task:
  		create 	a class called carInfo:
  				year
  				Brand
  				Model
  				Mileage
  				Price

  				print the info of the car

  				Ex:

  				 2020
  				 BMW
  				 X5
  				 30000
  				 45000

  		output:

  				2020 BMW X5, 3000 miles, $45000
 */
public class CarInfo {
    public static void main(String[] args) {
        int year = 2020;
        String brand = "Toyota";
        String model = "Corolla";
        int mileage = 50000;
        double price = 25000.50;
        String color = "Red";
    // 2018 Toyota Corolla Red, 5000 miles, $25000.5
        System.out.println(year+" "+brand+" " + model+ ", "+color+", "+mileage +" miles, $"+price);


    }
}

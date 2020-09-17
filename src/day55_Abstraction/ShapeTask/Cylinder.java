package day55_Abstraction.ShapeTask;
/*
2. create a sbub class of shape called Circle (meant to be subclass ONLY)
			attributes: radius, name(static), area, perimeter, hasVolume(static), volume
			override the abstract methods
			(if the shape does not have volume, return 0 for the colume)
			add a constructor that takes an argument for radius of the circle and initialize the instance variables: radius, area, perimeter, volume
			add a static block that can initialize the static variables of the circle
 */
import java.text.DecimalFormat;
public final class Cylinder extends Shape{

    public double radius;
    public double height;

    /*
    6 variables:
            2 statics: name, hasVolume
            4 instance: radius, area, perimeter, volume
     */

    public Cylinder(double radius, double height) {
        if(radius<=0 || height<= 0){
            throw new RuntimeException("Radius and Height of Cylinder cannot be negative or 0");
        }

        this.radius = radius;
        this.height = height;
        area =  calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
        name = "Rectangle";
        hasVolume = false;
    }

    @Override
    public double calculateArea() {
        return  (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return (2*Math.PI*height)+(4*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius,2)*height*Math.PI;
    }




    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", volume=" + df.format(volume) +
                '}';
    }
}

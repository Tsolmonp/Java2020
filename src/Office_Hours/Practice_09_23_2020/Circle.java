package Office_Hours.Practice_09_23_2020;

public class Circle extends Shape {

    public double radius;

    public Circle(double radius ){
        if(radius <= 0){
            throw new RuntimeException("Circle radius cannot have negative or 0");
        }
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }
    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}

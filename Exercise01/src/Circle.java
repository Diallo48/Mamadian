public class Circle extends Shape{

 private double radius;

    @Override
    double area() {
        return Math.PI* radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}


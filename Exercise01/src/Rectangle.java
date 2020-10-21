public class Rectangle extends Shape{
    private double height;
    private double width;


    @Override
    double area() {
        return height * width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}


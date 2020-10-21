public class Client {
    public static void main(String[] args) {
        double a = 4;
        double b = 2;

        Rectangle rectangle = new Rectangle(a,b);
        Circle circle = new Circle(b);
        System.out.println(rectangle.area());
        System.out.println(circle.area());

    }
}

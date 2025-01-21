public class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        setType(Type.CIRCLE);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }
}

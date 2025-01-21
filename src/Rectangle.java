public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB) {
        setType(Type.RECTANGLE);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}
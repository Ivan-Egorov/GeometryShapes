public class Square extends Shape {
    private double side;

    Square(double side) {
        setType(Type.SQUARE);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }
}

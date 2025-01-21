import java.util.Random;

public class ShapeUtil {
    private static Random random = new Random();

    public static Circle createRandomCircle() {
        return new Circle(random.nextDouble(10));
    }

    public static Square createRandomSquare() {
        return new Square(random.nextDouble(10));
    }

    public static Rectangle createRandomRectangle() {
        return new Rectangle(random.nextDouble(10), random.nextDouble(10));
    }

    public static Shape createRandomShape() {
        int randomNumber = random.nextInt(3);
        return switch (randomNumber) {
            case 0 -> ShapeUtil.createRandomCircle();
            case 1 -> ShapeUtil.createRandomSquare();
            case 2 -> ShapeUtil.createRandomRectangle();
            default -> throw new IllegalArgumentException("Really?");
        };
    }

    public static double calculateArea(Shape[] shapes) {
        double total = 0.0;

        for (Shape shape : shapes) {
            total += shape.calculateArea();
        }
        return total;
    }

    public static double calculatePerimeter(Shape[] shapes) {
        double total = 0.0;

        for (Shape shape : shapes) {
            total += shape.calculatePerimeter();
        }
        return total;
    }
}

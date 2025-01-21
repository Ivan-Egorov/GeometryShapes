import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Circle circle1 = new Circle(1.5);
    Circle circle2 = new Circle(1.5);
    Circle circle3 = ShapeUtil.createRandomCircle();

    Square square1 = new Square(1.5);
    Square square2 = new Square(1.5);

    Rectangle rectangle1 = new Rectangle(1.5, 1.5);
    Rectangle rectangle2 = new Rectangle(1.5, 1.5);

    @Test
    void testEquals() {
        assertAll(
                () -> assertEquals(circle1, circle2),
                () -> assertEquals(square1, square2),
                () -> assertEquals(rectangle1, rectangle2),
                () -> assertEquals(circle1, circle1),
                () -> assertNotEquals(null, circle1),
                () -> assertNotEquals(circle1, square1),
                () -> assertNotEquals(circle1, rectangle1),
                () -> assertNotEquals(square1, rectangle1),
                () -> assertNotEquals(circle1, circle3)
        );
    }

    @Test
    void testHashCode() {
        assertAll(
                () -> assertEquals(circle1.hashCode(), circle2.hashCode()),
                () -> assertEquals(square1.hashCode(), square2.hashCode()),
                () -> assertEquals(rectangle1.hashCode(), rectangle2.hashCode()),
                () -> assertEquals(circle1.hashCode(), circle1.hashCode()),
                () -> assertNotEquals(circle1.hashCode(), square1.hashCode()),
                () -> assertNotEquals(circle1.hashCode(), rectangle1.hashCode()),
                () -> assertNotEquals(square1.hashCode(), rectangle1.hashCode()),
                () -> assertNotEquals(circle1.hashCode(), circle3.hashCode())
        );
    }

    @Test
    public void shouldFindEqualRectangles() {
        List<Shape> shapes = List.of(
                new Rectangle(1.0, 2.0),
                new Rectangle(1.0, 2.0),
                new Rectangle(3.0, 2.0),
                new Rectangle(1.0, 3.0),
                new Rectangle(2.0, 1.0),
                new Square(1.0),
                new Circle(1.0)
        );
        Shape rectangle = new Rectangle(1.0, 2.0);
        List<Shape> equalRectangles = shapes.stream().filter(shape -> shape.equals(rectangle)).toList();
        assertEquals(3, equalRectangles.size());
    }
}
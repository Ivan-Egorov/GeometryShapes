import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

    @Test
    void integrationTesting() {
        Shape[] shapes = {
                new Circle(4),
                new Square(1),
                new Rectangle(2, 3),
        };

        assertEquals(57.26544, ShapeUtil.calculateArea(shapes), 0.0001);
        assertEquals(39.13272, ShapeUtil.calculatePerimeter(shapes), 0.0001);
    }
}
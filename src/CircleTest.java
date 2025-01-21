import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void calculateArea() {
        assertEquals(3.14, (new Circle(1).calculateArea()), 0.01);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(6.28, (new Circle(1).calculatePerimeter()), 0.01);
    }
}
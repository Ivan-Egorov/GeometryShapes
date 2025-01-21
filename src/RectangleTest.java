import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateArea() {
        assertEquals(2.0, new Rectangle(1, 2).calculateArea());
    }

    @Test
    void calculatePerimeter() {
        assertEquals(6.0, new Rectangle(1, 2).calculatePerimeter());
    }
}
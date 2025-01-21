import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateArea() {
        assertEquals(1.0, new Square(1).calculateArea());
    }

    @Test
    void calculatePerimeter() {
        assertEquals(4.0, new Square(1).calculatePerimeter());
    }
}
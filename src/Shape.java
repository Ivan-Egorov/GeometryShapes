import java.util.Objects;

public abstract class Shape {
    private Type type;

    void setType(Type type) {
        this.type = type;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape object = (Shape) o;
        return ((this.type == object.type) &&
                (this.calculateArea() == object.calculateArea()) &&
                (this.calculatePerimeter() == object.calculatePerimeter()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(type.ordinal(), (int)this.calculateArea(), (int)this.calculatePerimeter());
    }
}
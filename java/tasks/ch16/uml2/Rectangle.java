package oop.java.tasks.ch16.uml2;

/**
 * Creates a {@link Rectangle} instance
 * Can accept width and height as a parameter and returns Rectangle's
 * area and circumference
 */
public class Rectangle extends AbstractShape implements IRectangle{

    private double width;
    private double height;

    Rectangle(){

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return (long) ((width + height) * 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;
        return Double.compare(getWidth(), rectangle.getWidth()) == 0 && Double.compare(getHeight(), rectangle.getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(getWidth());
        result = 31 * result + Double.hashCode(getHeight());
        return result;
    }
}

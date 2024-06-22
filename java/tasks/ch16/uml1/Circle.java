package oop.java.tasks.ch16.uml1;

public class Circle extends AbstractShape implements ITwoDimensional{

    private double radius;

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public double getArea() {
        return Math.PI *(Math.pow(radius,2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Area = " + getArea() +
                '}';
    }
}

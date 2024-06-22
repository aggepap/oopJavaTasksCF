package oop.java.tasks.ch17.uml2;


import java.io.Serializable;

/**
 * Creates a {@link Circle} instance
 * Can accept radius as a parameter and returns circle's
 * diameter, area and circumference
 */
public class Circle extends AbstractShape implements ICircle, Serializable,Cloneable {
    private static final long serialVersionUID = 9874L;
    private double radius;

    Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    //Copy Constructor
    public Circle(Circle circle){
        this.radius = circle.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public double getDiameter() {
        return radius *2;
    }

    @Override
    public double getArea() {
      return  Math.PI *(Math.pow(radius,2));
    }

    @Override
    public long getCircumference() {
        return (long)(2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius: " + radius +
                "Diameter: " + getDiameter() +
                "Area: " + getArea() +
                "Circumference: " + getCircumference() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(getRadius());
    }
}

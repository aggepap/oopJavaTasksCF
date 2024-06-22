package oop.java.tasks.ch17.uml2;


import java.io.Serializable;

/**
 * Create a {@link Line} instance accepting it's length
 * as a parameter
 */
public class Line extends AbstractShape implements ILine, Serializable,Cloneable {
    private static final long serialVersionUID = 1111L;
    private double length;

    Line(){

    }

    public Line(double length) {
        this.length = length;
    }

    //Copy Constructor
    public Line(Line line){
        this.length = line.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
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
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(getLength());
    }
}

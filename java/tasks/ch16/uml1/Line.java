package oop.java.tasks.ch16.uml1;

public class Line extends AbstractShape {
    private double length;

    public Line(){

    }

    public Line(double length) {
        this.length = length;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "," + "Length: " + length;
    }
}

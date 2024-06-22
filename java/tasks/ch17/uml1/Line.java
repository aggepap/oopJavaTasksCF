package oop.java.tasks.ch17.uml1;

import java.io.Serializable;

public class Line extends AbstractShape implements Serializable,Cloneable {
    private static final long serialVersionUID = 2456L;
    private double length;

    public Line(){
    }
    public Line(double length) {
        this.length = length;
    }

    //copy constructor

    public Line(Line line){
        this.length = line.length;
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

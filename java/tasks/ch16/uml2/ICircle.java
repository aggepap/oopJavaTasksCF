package oop.java.tasks.ch16.uml2;

public interface ICircle extends IShape, ITwoDimensional {

    double getDiameter();

    @Override
    long getId();

    @Override
    double getArea();

    @Override
    long getCircumference();
}

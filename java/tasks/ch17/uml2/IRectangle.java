package oop.java.tasks.ch17.uml2;

public interface IRectangle extends IShape, ITwoDimensional {

    @Override
    long getId();

    @Override
    double getArea();

    @Override
    long getCircumference();
}

package oop.java.tasks.ch15;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1);
        Point p2 = new Point2D(2, 12);
        Point p3 = new Point3D(5,21,22);


        System.out.println(p3.getDistanceFromOrigin());
        System.out.println(PointUtil.distanceFromOrigin(p1));
        System.out.println(PointUtil.distanceFromOrigin(p2));
        System.out.println(PointUtil.distanceFromOrigin(p3));
    }

}

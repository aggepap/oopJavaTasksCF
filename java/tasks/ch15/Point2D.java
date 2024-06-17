package oop.java.tasks.ch15;

public class Point2D extends Point {
private double y;

public Point2D(){
//    super();
//    y = 0;   αυτά τα κάνει αυτόματα το JVM, αλλα χρειάζονται και τα δύο. Γίνονται αυτόματα όμως
}

public Point2D(double x, double y){
    super(x); // είναι ο υπερφορτωμένος constructor της Point(x). Δεν καλείται αυτόματα
    this.y = y;
}

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String convertToString(){
        return "(" + getX() + "," + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y =+ 10;
    }

    @Override
    public void movePlus1() {
        super.movePlus1();
        y =+ 1;

    }

    @Override
    protected void reset() {
        super.reset();
        y=0;
    }

    @Override
    public double getDistanceFromOrigin() {
       double xDistance = super.getDistanceFromOrigin();
       double yDistance = y - 0;
       return Math.sqrt(Math.pow(yDistance,2) +Math.pow(xDistance,2));

    }
}

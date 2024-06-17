package oop.java.tasks.ch15;

public class Point {

    private double x;
public Point(){

}

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    protected String convertToString(){
    return "(" + x + ")";
    }

    //Public API
public double getDistanceFromOrigin(){
    return x - 0;
}
    public void movePlus10(){
    x+=10;
    }
    public void movePlus1(){
    x++;
    }
    protected void reset(){ // είναι API και αυτό, αλλα μονο για τις derived κλάσεις
    x=0;
    }

}

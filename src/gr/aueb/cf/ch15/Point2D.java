package gr.aueb.cf.ch15;

import static java.lang.Math.sqrt;

public class Point2D extends Point {
    private double y = 0;

    public Point2D() {
        super();
        y = 0;
    }

    public Point2D(int x, double y) {
        super();
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
            y += 10;
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "y=" + y +
                '}';
    }
}

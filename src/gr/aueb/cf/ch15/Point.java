package gr.aueb.cf.ch15;

public class Point {
    private double x = 0;

    public Point() {
    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void movePlusOne() {
        x++;
    }

    public void movePlus10() {
        for (int i = 0; i <= 10; i++) {
            movePlusOne();
        }
    }

    public void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }

    private void reset() {
        x = 0;
    }

    public double getDistanceFromOrigin() {
        return Math.abs(x);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                '}';
    }
}

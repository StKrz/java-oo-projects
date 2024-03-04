package gr.aueb.cf.ch16.SecondUML.shapes;

import gr.aueb.cf.ch16.SecondUML.AbstractShape;
import gr.aueb.cf.ch16.SecondUML.ICircle;

public class Circle extends AbstractShape implements ICircle {
    private double radius;
    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public long getCircumference() {
        return (long)(2 * Math.PI * radius);
    }
}

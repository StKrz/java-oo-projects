package gr.aueb.cf.ch16.UML2.shapes;

import gr.aueb.cf.ch16.UML2.AbstractShape;
import gr.aueb.cf.ch16.UML2.ICircle;

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

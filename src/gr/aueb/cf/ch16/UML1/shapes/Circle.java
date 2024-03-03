package gr.aueb.cf.ch16.UML1.shapes;

import gr.aueb.cf.ch16.UML1.AbstractShape;
import gr.aueb.cf.ch16.UML1.ITwoDimensional;

public class Circle extends AbstractShape implements ITwoDimensional {
    private long id;
    private double radius;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

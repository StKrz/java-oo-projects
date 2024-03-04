package gr.aueb.cf.ch16.FirstUML.shapes;

import gr.aueb.cf.ch16.FirstUML.AbstractShape;
import gr.aueb.cf.ch16.FirstUML.ITwoDimensional;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private long id;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public double getArea() {
        return 0;
    }
}

package gr.aueb.cf.ch16.UML2.shapes;

import gr.aueb.cf.ch16.UML2.AbstractShape;
import gr.aueb.cf.ch16.UML2.IRectangle;

import javax.swing.*;

public class Rectangle extends AbstractShape implements IRectangle {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return (long)(2 * (width + height));
    }
}

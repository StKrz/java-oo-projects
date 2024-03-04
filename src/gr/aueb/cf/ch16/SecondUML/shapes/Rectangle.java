package gr.aueb.cf.ch16.SecondUML.shapes;

import gr.aueb.cf.ch16.SecondUML.AbstractShape;
import gr.aueb.cf.ch16.SecondUML.IRectangle;

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

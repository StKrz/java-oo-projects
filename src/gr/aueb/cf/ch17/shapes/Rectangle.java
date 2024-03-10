package gr.aueb.cf.ch17.shapes;

import gr.aueb.cf.ch17.AbstractShape;
import gr.aueb.cf.ch17.IRectangle;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements IRectangle, Cloneable, Serializable {
    private static final long serialVersionUID = 3L;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle2) {
        this.width = rectangle2.width;
        this.height = rectangle2.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return (long)(2 * (width + height));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Rectangle rectangle = (Rectangle) obj;

        return Objects.equals(rectangle.width, width) && Objects.equals(rectangle.height, height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth());
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Clone is not supported!");
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height + ", Area= " + getArea() +
                ", Circumference= " + getCircumference() +
                '}';
    }
}

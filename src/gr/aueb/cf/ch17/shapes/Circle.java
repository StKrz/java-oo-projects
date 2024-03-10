package gr.aueb.cf.ch17.shapes;

import gr.aueb.cf.ch17.AbstractShape;
import gr.aueb.cf.ch17.ICircle;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ICircle, Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Circle circle = (Circle) obj;

        return Objects.equals(radius, circle.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Clone is not supported");
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", Diameter= "
                + getDiameter() + ", Area= " + getArea() +
                '}';
    }
}

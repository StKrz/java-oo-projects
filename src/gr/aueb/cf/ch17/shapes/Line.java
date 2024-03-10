package gr.aueb.cf.ch17.shapes;

import gr.aueb.cf.ch17.AbstractShape;
import gr.aueb.cf.ch17.ILine;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements ILine, Cloneable, Serializable {
    private static final long serialVersionUID = 2L;
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public Line(Line line2) {
        this.length = line2.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Line line = (Line) obj;

        return Objects.equals(length, line.getLength());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength());
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        try {
            return (Line) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Clone is not supported");
        }
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length + ", Length= " + getLength() +
                '}';
    }
}

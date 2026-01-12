package gr.aueb.cf.cf9.ch15.hw1;

import gr.aueb.cf.cf9.ch13.hw1.Mathhelper;

public class Circle extends AbstractShape implements ITwoDimensional {

    private double radius;

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: (radius = " + radius + ", id = " + getId() + "area = " + getArea() + ")";
    }
}

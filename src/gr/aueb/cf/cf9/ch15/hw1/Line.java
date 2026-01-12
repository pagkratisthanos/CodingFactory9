package gr.aueb.cf.cf9.ch15.hw1;

public class Line extends AbstractShape{

    private double length;

    public Line(long id, double length) {
        super(id);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line: (length = " + length + ", id = " + getId() + ")";
    }

}

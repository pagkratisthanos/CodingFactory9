package gr.aueb.cf.cf9.ch12.hw1;

import gr.aueb.cf.cf9.ch5.SwapApp;

import java.sql.SQLData;

public class PointXYZ {

    private double x;
    private double y;
    private double z;

    public PointXYZ() {

    }

    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getXYDistance() {
        double xyDistance = Math.sqrt((x * x) + (y * y));
        return xyDistance;
    }

    public double getYZDistance() {
        double yzDistance = Math.sqrt((y * y) + (z * z));
        return yzDistance;
    }

    public double getXZDistance() {
        double xzDistance = Math.sqrt((x * x) + (z * z));
        return xzDistance;
    }

    public double getXYZDistance() {
        double xyzDistance = Math.sqrt((x * x) + (y * y) + (z * z));
        return xyzDistance;
    }
}

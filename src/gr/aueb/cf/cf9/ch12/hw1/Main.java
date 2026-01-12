package gr.aueb.cf.cf9.ch12.hw1;

public class Main {

    public static void main(String[] args) {

        PointXYZ point = new PointXYZ(2, 5, 9);
        double xyDistance = point.getXYDistance();
        double yzDistance = point.getYZDistance();
        double xzDistance = point.getXZDistance();
        double xyzDistance = point.getXYZDistance();

        System.out.println("xyDistance = " + xyDistance + "\n" + "yzDistance = " +yzDistance + "\n" +
                 "xzDistance = " +xzDistance + "\n" + "xyzDistance = " + xyzDistance);

    }
}

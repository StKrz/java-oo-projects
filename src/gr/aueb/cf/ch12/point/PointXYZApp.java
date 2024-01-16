package gr.aueb.cf.ch12.point;

public class PointXYZApp {

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        PointXYZ pointXYZ = new PointXYZ(point, 3);

        System.out.println(pointXYZ);
    }
}

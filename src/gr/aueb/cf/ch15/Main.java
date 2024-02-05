package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setX(2);
        point3D.setY(3);
        point3D.setZ(4);

        System.out.println(point3D.getDistanceFromOrigin());
    }
}

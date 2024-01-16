package gr.aueb.cf.ch12.point;

public final class PointXYZ {
    private final Point point;
    private final int z;

    public PointXYZ() {
        point = new Point();
        z = 0;
    }

    public PointXYZ(Point point, int z) {
        this.point = point;
        this.z = z;
    }

    public Point getPoint() {
        return point;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "PointXYZ{" + point +
                ", z=" + z +
                '}';
    }
}

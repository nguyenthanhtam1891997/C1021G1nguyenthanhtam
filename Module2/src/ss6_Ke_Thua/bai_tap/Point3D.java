package ss6_Ke_Thua.bai_tap;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public static void main(String[] args) {
        Point2D point2D =new Point3D(5);
    }
}

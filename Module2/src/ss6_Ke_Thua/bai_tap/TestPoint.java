package ss6_Ke_Thua.bai_tap;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3,4);
        System.out.println(point2D);

        Point3D point3D = new Point3D(3);
        System.out.println(point3D);
        point3D = new Point3D(4,8,7);
        System.out.println(point3D);

        Movable_Point movable = new Movable_Point(5,8);
        System.out.println(movable);
        System.out.println(movable.move());

    }
}

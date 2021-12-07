package ss6_Ke_Thua.bai_tap;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        circle=new Cylinder(3.5,"blue",8);
        System.out.println(circle);
    }
}

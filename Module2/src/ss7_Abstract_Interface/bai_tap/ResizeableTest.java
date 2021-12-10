package ss7_Abstract_Interface.bai_tap;

import ss6_Ke_Thua.thuc_hanh.Circle;
import ss6_Ke_Thua.thuc_hanh.Rectangle;
import ss6_Ke_Thua.thuc_hanh.Shape;
import ss6_Ke_Thua.thuc_hanh.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        
        Resizeable[] resizes=new Resizeable[3];
        resizes[0]=new Circle(2);
        resizes[1]=new Rectangle(5,2);
        resizes[2]=new Square(5);
        System.out.println("Pre-sorted");
        for (Resizeable resizer:resizes){
            if(resizer instanceof Circle){
                resizer=(Circle) resizer;
                System.out.println(((Circle) resizer).getArea());
            }else if (resizer instanceof Rectangle){
                resizer=(Rectangle) resizer;
                System.out.println(((Rectangle) resizer).getArea());
            }else {
                resizer=(Square) resizer;
                System.out.println(((Square) resizer).getArea());
            }
        }
        System.out.println("After-sorted:");
        for (Resizeable resizer:resizes){
            if(resizer instanceof Circle){
                resizer=(Circle) resizer;
                resizer.resize(200);
                System.out.println(((Circle) resizer).getArea());
            }else if (resizer instanceof Rectangle){
                resizer=(Rectangle) resizer;
                resizer.resize(200);
                System.out.println(((Rectangle) resizer).getArea());
            }else if (resizer instanceof Square){
                resizer=(Square) resizer;
                System.out.println();
            }
        }
    }
}

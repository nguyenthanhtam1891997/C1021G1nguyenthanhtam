package ss7_Abstract_Interface.bai_tap;

import ss6_Ke_Thua.thuc_hanh.Circle;
import ss6_Ke_Thua.thuc_hanh.Rectangle;
import ss6_Ke_Thua.thuc_hanh.Shape;
import ss6_Ke_Thua.thuc_hanh.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] arrays=new Shape[3];
        arrays[0]=new Square(5);
        arrays[1]=new Circle(2);
        arrays[2]=new Rectangle(5,2);
        for (Shape array:arrays){
            if (array instanceof Rectangle){
                array=(Rectangle) array;
                System.out.print(((Rectangle) array).getArea());
            }else if (array instanceof Circle){
                array=(Circle) array;
                System.out.println(((Circle) array).getArea());
            }
            if (array instanceof Colorable){
                ((Colorable) array).howToColor();
            }

        }
    }
}

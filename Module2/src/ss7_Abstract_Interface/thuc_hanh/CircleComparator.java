package ss7_Abstract_Interface.thuc_hanh;

import ss6_Ke_Thua.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius()>c2.getRadius())return 1;
        else if (c1.getRadius()<c2.getRadius())return -1;
        else return 0;
    }
}

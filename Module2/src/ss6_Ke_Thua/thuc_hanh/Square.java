package ss6_Ke_Thua.thuc_hanh;


import ss7_Abstract_Interface.bai_tap.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }
    public Square(double side){
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
//    public void setWidth(double width){
//        setSide(width);
//    }
//    public void setLength(double length){
//        setSide(length);
//    }

    @Override
    public String toString() {
        return "A Square with side="
                +getSide()
                +", which is a subclass of "
                +super.toString();
    }
    public void resize(double percent){
        setSide(getSide()+getSide()*(percent/100));
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides");
    }
}

package ss6_Ke_Thua.thuc_hanh;

public class Square extends Rectangle{
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
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                +getSide()
                +", which is a subclass of "
                +super.toString();
    }
}

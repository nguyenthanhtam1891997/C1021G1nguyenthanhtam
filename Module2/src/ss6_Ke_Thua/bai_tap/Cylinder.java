package ss6_Ke_Thua.bai_tap;

public class Cylinder extends Circle{
    private double height=1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
   public void setRadian(double radian){
        setRadius(radian);
   }
   public double getRadian(){
        return getRadius();
   }
   public double getVolume(){
        return getRadian()*getRadian()*height*Math.PI;
   }

    @Override
    public String toString() {
        return "Cylinder " +
                "height=" + height +" radius "+getRadius()+" volume "+getVolume()+" "+super.toString();

    }
}

package ss5_Static.bai_tap;

public class Access_modifier {
    private double radius=1;
    private String color="red";
    public  Access_modifier(){}

    public Access_modifier(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }
}

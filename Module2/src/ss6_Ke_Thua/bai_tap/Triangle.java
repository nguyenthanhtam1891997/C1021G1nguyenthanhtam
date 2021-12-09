package ss6_Ke_Thua.bai_tap;

import ss6_Ke_Thua.thuc_hanh.Shape;

public class Triangle extends Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(){}

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double s = Math.sqrt(getPerimeter()/2*(getPerimeter()/2-side1)*(getPerimeter()/2-side2)*(getPerimeter()/2-side3));
        return s;
    }
    public double getPerimeter(){
        double p = this.side1+this.side2+this.side3;
        return p;
    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle(5,7,8);
        System.out.println("Area = "+triangle.getArea());
        System.out.println("Perimeter = "+triangle.getPerimeter());
    }
}

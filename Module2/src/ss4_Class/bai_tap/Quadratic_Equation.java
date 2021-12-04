package ss4_Class.bai_tap;


import javax.swing.*;
import java.util.Scanner;

public class Quadratic_Equation {
    double a,b,c;
    private Quadratic_Equation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    private double getDiscriminant(){
        double delta =b *this.b-(4*this.a*this.c);
        return delta;
    }
    private void check(){
        if (getDiscriminant()>0){
            System.out.print("Value off root1 and root2: "+getRoot1()+" ,"+getRoot2());
        }else if (getDiscriminant()==0){
            System.out.print("the equation has a solution:"+(-this.b/2*this.a));
        }else if (getDiscriminant()<0){
            System.out.println("The equation has no roots");
        }
    }
    private double getRoot1(){
        double root1=(-this.b+ Math.sqrt(this.b*this.b-(4*this.a*this.c)))/2*this.a;
        return root1;
    }
    private double getRoot2(){
        double root2 = (-this.b- Math.sqrt(this.b*this.b-(4*this.a*this.c)))/2*this.a;
        return root2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = input.nextDouble();
        System.out.print("Enter b:");
        double b = input.nextDouble();
        System.out.print("Enter c:");
        double c = input.nextDouble();
        Quadratic_Equation tex = new Quadratic_Equation(a,b,c);
        System.out.print("The delta is:"+tex.getDiscriminant());
        System.out.print("\nThe root is: ");
        tex.check();

    }
}

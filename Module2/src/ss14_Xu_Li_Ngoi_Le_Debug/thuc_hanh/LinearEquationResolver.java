package ss14_Xu_Li_Ngoi_Le_Debug.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x +b'");
        Scanner input =new Scanner(System.in);
        System.out.print("a: ");
        double a=input.nextDouble();

        System.out.print("b: ");
        double b=input.nextDouble();

        if (a!=0){
            double solution=-b/a;
            System.out.printf("the solution is: %f!",solution);
        }else {
            if (b==0){
                System.out.println("the solution is all x!");
            }else {
                System.out.println("No solution!");
            }
        }
    }
}

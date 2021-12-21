package ss14_Xu_Li_Ngoi_Le_Debug.thuc_hanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            System.out.print("Hãy nhập x: ");

            int x=Integer.parseInt(input.nextLine());
            System.out.println("Hãy nhập y: ");
            int y = Integer.parseInt(input.nextLine());
            CalculationExample calc =new CalculationExample();
            calc.calculate(x,y);
        }catch (NumberFormatException e){
            System.out.println("Đây là số thực hãy nhập số nguyên: ");
        }catch (InputMismatchException e){
            System.out.println("Hãy nhập số ");
        }
    }
    private void  calculate(int x,int y){
        try {
            int a=x+y;
            int b=x-y;
            int c=x * y;
            double d=x/y;
            System.out.println("Tổng x+y = "+a);
            System.out.println("Hiệu x-y = "+b);
            System.out.println("Tích x*y = "+c);
            System.out.println("Thương x/y = "+d);
        }catch (Exception e){
            System.out.println("Xãy ra ngoại lệ: "+e.getMessage());
        }
    }
}

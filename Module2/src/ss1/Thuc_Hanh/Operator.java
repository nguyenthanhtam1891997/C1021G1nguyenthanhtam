package ss1.Thuc_Hanh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);// khai báo đối tượng scanner để nhập dữ liệu từ bàn phím
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Area is: "+area);
    }
}

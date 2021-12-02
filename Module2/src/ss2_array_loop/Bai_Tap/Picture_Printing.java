package ss2_array_loop.Bai_Tap;

import java.util.Scanner;

public class Picture_Printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        int row;
        int column;
        while (choice != 0) {
            System.out.println("litMenu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhập số hàng");
                     row = input.nextInt();
                    System.out.println("nhập số cột");
                     column = input.nextInt();
                    for (int i=0;i<row;i++){
                        for (int j=0;j<column;j++){
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("nhập số hàng");
                    row = input.nextInt();
                    for (int i=0;i<row;i++){
                        for (int j=0;j<=i;j++){
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("nhập số hàng");
                    row = input.nextInt();
                    for (int i=0;i<row;i++){
                        for (int j=row;j>i;j--){
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }


    }
}

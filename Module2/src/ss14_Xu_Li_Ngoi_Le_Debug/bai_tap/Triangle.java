package ss14_Xu_Li_Ngoi_Le_Debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        int a=0,b=0,c=0;
        do {
            try {
                System.out.print(" nhập cạnh a:");
                a = Integer.parseInt(input.nextLine());
                if (a < 0) {
                    throw new IllegalTriangleException("Không nhập số âm ");
                }
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getError());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        } while (true);
        do {
            try {
                System.out.print(" nhập cạnh b:");
                b = Integer.parseInt(input.nextLine());
                if (b < 0) {
                    throw new IllegalTriangleException("Không nhập số âm ");
                }
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getError());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        } while (true);
        do {
            try {
                System.out.print(" nhập cạnh c:");
                c = Integer.parseInt(input.nextLine());
                if (c < 0) {
                    throw new IllegalTriangleException("Không nhập số âm ");
                }
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getError());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        } while (true);
        try {
            if ((a+b)<c||(a+c)<b||(b+c)<a){
                throw new IllegalTriangleException("không được nhập 2 cạnh bé hơn cạnh thứ 3");
            }
        }catch (IllegalTriangleException e){
            System.out.println(e.getError());
        }

    }
}

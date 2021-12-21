package ss14_Xu_Li_Ngoi_Le_Debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);


        try {

            System.out.print(" nhập cạnh a:");
            int a =Integer.parseInt(input.nextLine());
            if (a < 0) {
                throw new IllegalTriangleException("Không nhập số âm");
            }
            System.out.print(" nhập cạnh b:");
            int b = Integer.parseInt(input.nextLine());
            if (b < 0) {
                throw new IllegalTriangleException("Không nhập số âm");
            }
            System.out.print(" nhập canh c:");
            int c = Integer.parseInt(input.nextLine());
            if (c < 0) {
                throw new IllegalTriangleException("Không nhập số âm");
            }
            if (a+b<c||b+c<a||a+c<b){
                throw new IllegalTriangleException("Lỗi tổng 2 cạnh không lớn hơn cạnh còn lại ");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getError());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (InputMismatchException e1){
            e1.printStackTrace();
        }
    }
}

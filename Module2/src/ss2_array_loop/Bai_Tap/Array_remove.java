package ss2_array_loop.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_remove {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài mãng : ");
            size = input.nextInt();
            if (size>20)
                System.out.println("không được nhập quá 20");
        } while (size>20);
        int[] array = new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("nhập phần thử thứ "+(i+1)+" trong mãng ");
            array[i]= input.nextInt();
        }
        System.out.print("mãng được hình thành: ");
        System.out.print(Arrays.toString(array));
        System.out.print("\nnhập số muốn xoá trong mãng: ");
        int numDelete = input.nextInt();
        int check=-1;
        for (int i=0;i<array.length;i++){
            if (array[i]==numDelete){
                check=i+1;
                for (int j=i;j<array.length-1;j++){
                    array[j] = array[j+1];
                }
                array[array.length-1]=0;
                break;
            }
        }
        if (check != -1) {
            System.out.print("vị trí có số cần xoá: ");
            System.out.println(check);
        } else {
            System.out.println("không tìm thấy số cần xoá trong mãng ");
        }
        System.out.print("mãng sau khi đã xoá: ");
        System.out.print(Arrays.toString(array));



    }
}

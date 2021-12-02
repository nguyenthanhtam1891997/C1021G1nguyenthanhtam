package ss2_array_loop.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        int N;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("nhập độ dài mãng :");
            N= input.nextInt();
            if (N>20)
                System.out.println("độ dài mãng chỉ bé hon 20");
        }while (N>20);
        array=new int[N];
        for (int i=0;i<array.length;i++){
            System.out.print("nhập phần tử trong mãng");
            array[i]= input.nextInt();
        }
        System.out.print("mãng đã tạo ra: ");
        System.out.print(Arrays.toString(array));
        System.out.print("\nnhập số muốn chèn vào mãng:");
        int num = input.nextInt();
        System.out.print("nhập vị trí muốn chèn vào ");
        int index = input.nextInt();
        if (index<=1||index>=array.length-1){
            System.out.println("không chèn được phần tử vào mãng");
        }else {
            for (int i=0;i<array.length;i++){
                if (i==index-1){
                    for (int j= array.length-1;j>i;j--){
                        array[j]=array[j-1];
                    }
                    array[i]=num;
                    break;
                }
            }
        }
        System.out.print("mãng sau khi đã chèn phần tử vào ");
        System.out.println(Arrays.toString(array));
    }
}

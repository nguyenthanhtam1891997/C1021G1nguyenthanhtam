package ss2_array_loop.Thuc_Hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Array_find_max {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter size: ");
            size= input.nextInt();
            if (size>20){
                System.out.println("size does not exceed 20");
            }
        }while (size>20);
        array= new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            array[i]= input.nextInt();
        }
        System.out.printf("%-10s%s","Element array: ","");
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int index=0;
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max = array[i];
                index=i+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}

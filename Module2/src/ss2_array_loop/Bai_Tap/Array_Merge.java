package ss2_array_loop.Bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Merge {
    public static void main(String[] args) {
        int sizeA;
        int sizeB;
        int[] arrayA;
        int[] arrayB;
        Scanner input = new Scanner(System.in);
        System.out.print("nhập độ dài mãng a: ");
        sizeA = input.nextInt();
        arrayA = new int[sizeA];
        for (int i=0;i<arrayA.length;i++){
            System.out.print("nhập phần tử mãng a:");
            arrayA[i]= input.nextInt();
        }
        System.out.print("nhập độ dài mãng b: ");
        sizeB = input.nextInt();
        arrayB = new int[sizeB];
        for (int i=0;i<arrayB.length;i++){
            System.out.print("nhập phần tử mãng b: ");
            arrayB[i]= input.nextInt();
        }
        System.out.print("mãng a: "+ Arrays.toString(arrayA));
        System.out.print(" mãng b: "+Arrays.toString(arrayB));

        int[] arrayC = new int[sizeA+sizeB];
        for (int i=0;i<arrayA.length;i++){
            arrayC[i]=arrayA[i];
        }
        for (int i=0;i<arrayB.length;i++){
            arrayC[arrayA.length+i]=arrayB[i];
        }
        System.out.print(" mãng c: "+Arrays.toString(arrayC));
    }
}

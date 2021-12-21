package ss13_Thuat_Toan_Xap_Xep.bai_tap;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size =Integer.parseInt(input.nextLine());
        int[] list=new int[size];
        System.out.print("Enter "+list.length+" values:");
        for (int i=0;i< list.length;i++){
            list[i]=Integer.parseInt(input.nextLine());
        }
        System.out.println("you input list: ");
        for (int i=0;i< list.length;i++){
            System.out.print(list[i] +"\t");
        }
        System.out.println("\n/*/*/*/*/*/*/*/*/*/");
        InsertionSort.insertionSort(list);
        System.out.print("mãng sau khi xắp xếp: ");
        for (int i=0;i< list.length;i++){
            System.out.print(" "+list[i]+"\t");
        }
    }
}

package ss13_Thuat_Toan_Xap_Xep.thuc_hanh;

import java.util.Scanner;

public class BubbleSortByStep {
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
        BubbleSort.bubble(list);
        System.out.print("\nmãng sau khi xắp xếp: ");
        for (int i=0;i< list.length;i++){
            System.out.print(list[i]+"\t");
        }
    }
}

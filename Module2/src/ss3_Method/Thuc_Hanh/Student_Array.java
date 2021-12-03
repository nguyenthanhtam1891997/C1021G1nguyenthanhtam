package ss3_Method.Thuc_Hanh;

import java.util.Scanner;

public class Student_Array {
    public static void main(String[] args) {
        int size;
        int[]array;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter size:");
            size = input.nextInt();
            if (size>30)
                System.out.print("Size should not exceed 30");
        }while (size>30);
        array =new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("Enter a mark for student "+(i+1)+":");
            array[i]= input.nextInt();
        }
        int count=0;
        System.out.print("List of mark:");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
            if (array[i]>=5&&array[i]<=10){
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}

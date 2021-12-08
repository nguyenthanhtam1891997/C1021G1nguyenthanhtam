package ss2_array_loop.Bai_Tap;

import java.util.Scanner;

public class Array_sum_column {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][] array = setArray();
        int sum=0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.print("hãy chọn cột cần tính tổng: ");
        int column= input.nextInt();
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (j==column-1){
                    sum+=array[i][j];
                }
            }
        }
        System.out.print("tổng của cột đã chọn là "+sum);
    }
    public static int[][] setArray(){
        Scanner input =new Scanner(System.in);
        System.out.print("nhập số lượng mãng: ");
        int size1= input.nextInt();
        int size2;
        int[][] array= new int[size1][];
        for (int i=0;i< array.length;i++){
            System.out.print("nhập số phần tử có trong mãng "+(i+1)+":");
            size2= input.nextInt();
            array[i]=new int[size2];
            for (int j=0;j<array[i].length;j++){
                System.out.print("nhập giá trị của phần tử "+"["+i+","+j+"]: ");
                array[i][j]= input.nextInt();
            }
        }
        return array;
    }
}

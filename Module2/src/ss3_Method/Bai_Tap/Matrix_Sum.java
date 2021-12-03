package ss3_Method.Bai_Tap;
import java.util.Scanner;

public class Matrix_Sum {
    public static void main(String[] args) {
        int [][] matrix=setArray();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
        int sum=0;
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (i==j){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static int[][]setArray(){
        Scanner input =new Scanner(System.in);
        System.out.print("nhập số lượng mãng: ");
        int size1 = input.nextInt();
        int size2;
        int[][]array=new int[size1][];
        for (int i=0;i< array.length;i++){
            System.out.print("nhập số phần tử có trong mãng "+(i+1)+":");
            size2 = input.nextInt();
            array[i]=new int[size2];
            for (int j=0;j<array[i].length;j++){
                System.out.print("nhập giá trị của phần tử "+"["+i+","+j+"]: ");
                array[i][j]= input.nextInt();
            }
        }
        return array;
    }
}

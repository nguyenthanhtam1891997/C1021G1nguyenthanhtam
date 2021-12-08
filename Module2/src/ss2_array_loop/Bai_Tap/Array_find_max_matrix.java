package ss2_array_loop.Bai_Tap;

import java.util.Scanner;

public class Array_find_max_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số hàng ");
        int h= input.nextInt();
        System.out.print("nhập số cột");
        int c= input.nextInt();
        int[][] matrix= matrix(h,c);
       // int[][] matrix ={{7,5,6,4},{8,7,3,10,22},{9,4,3,1,0}};

        double max =matrix[0][0];
        int x=0;
        int y=0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (max<matrix[i][j]){
                    max=matrix[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.print("Max in matrix: "+max+" index"+x+" "+y);
    }
    public static int[][] matrix(int a,int b){
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[a][b];
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.print("nhập phần tử "+i+" "+j+" trong matrix: "+"\t");
                matrix[i][j]= input.nextInt();

            }

        }
        return matrix;
    }
}

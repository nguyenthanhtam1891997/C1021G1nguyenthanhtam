package ss14_Xu_Li_Ngoi_Le_Debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd =new Random();
        Integer[] arr=new Integer[100];
        System.out.println("Danh sách phần tử của mãng: ");
        for(int i=0;i<100;i++){
            arr[i]=rd.nextInt(100);
            System.out.print(arr[i]+" "+"\t");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner input=new Scanner(System.in);
        System.out.println("\nvui lòng nhập giá trị số của một phần tử bất kỳ: ");
        int x =input.nextInt();
        try {
            System.out.println("Gía trị của phần tử có chỉ số 5"+x+" là "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chỉ số vượt quá giới hạn của mãng");
        }
    }
}

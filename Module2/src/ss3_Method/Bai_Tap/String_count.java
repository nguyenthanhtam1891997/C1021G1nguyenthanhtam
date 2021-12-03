package ss3_Method.Bai_Tap;

import java.util.Scanner;

public class String_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tex ="Luyện tập sử dụng mảng và cấu trúc lặp";
        System.out.print("hãy nhập kí tự muốn kiểm tra: ");
        char x = input.next().charAt(0);
        int count =0;
        for (int i=0;i<tex.length();i++){
            if (tex.charAt(i)==x){
                System.out.print("vị trí có "+ x+ " là :");
                System.out.print(i+1+"\n");
                count++;
            }
        }
        System.out.println("\nsố lần "+x+" xuất hiện trong chuỗi: "+count);
    }
}

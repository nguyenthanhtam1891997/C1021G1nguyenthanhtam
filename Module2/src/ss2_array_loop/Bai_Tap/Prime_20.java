package ss2_array_loop.Bai_Tap;

import java.util.Scanner;

public class Prime_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter number");
        int num = input.nextInt();
        int n =2;
        boolean check;
        while (count<num){
            check =true;
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n % i==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(" "+n);
                count++;
            }
            n++;
        }
    }
}

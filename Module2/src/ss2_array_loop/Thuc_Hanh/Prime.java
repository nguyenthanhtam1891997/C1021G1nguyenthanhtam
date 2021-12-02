package ss2_array_loop.Thuc_Hanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        if (num < 2){
            System.out.println(num+" is not a prime");
        }else {
            int i =2;
            boolean check = true;
            while (i <= Math.sqrt(num)){
                if(num % i ==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(num+" is a prime");
            else
                System.out.println(num+" is not a prime");
        }
    }
}

package ss2_array_loop.Thuc_Hanh;

import java.util.Scanner;

public class Interest_Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money");
        double money = input.nextDouble();
        System.out.println("Enter rate ");
        double rate = input.nextDouble();
        System.out.println("Enter month");
        int month = input.nextInt();
        double total = 0;
        for (int i=0;i<month;i++){
            total += money * (rate/100)/12 * month;
        }
        System.out.println("Total of interest: "+total );
    }
}

package ss1.Bai_Tap;

import java.util.Scanner;

public class Money_Conversion {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tiền usd: ");
        USD  = scanner.nextDouble();
        double exchange = USD * VND;
        System.out.print("tiền quy đỗi là: "+ exchange);
    }
}

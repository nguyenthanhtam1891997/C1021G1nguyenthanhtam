package ss1.Bai_Tap;

import java.util.Scanner;

public class Money_Conversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tiền usd: ");
        usd  = scanner.nextDouble();
        double exchange = usd * vnd;
        System.out.print("tiền quy đỗi là: "+ exchange);
    }
}

package ss1.Bai_Tap;

import java.util.Scanner;

public class Show_Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter yor name:");
        String name =  scanner.nextLine();
        System.out.print("Hello: "+name);
    }
}

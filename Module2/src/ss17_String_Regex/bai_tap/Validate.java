package ss17_String_Regex.bai_tap;

import java.util.Scanner;

public class Validate {
    public static final String ACCOUNT="[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter you write");
            String line=input.nextLine();
            System.out.println(line.matches(ACCOUNT));
        }
    }
}

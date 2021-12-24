package ss17_String_Regex.bai_tap;

import java.util.Scanner;

public class PhoneNumber {
    public static final String PHONE_NUM="[0-9]{2}[-](0).*[0-9]{9}";
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter you write");
            String line=input.nextLine();
            System.out.println(line.matches(PHONE_NUM));
        }
    }
}

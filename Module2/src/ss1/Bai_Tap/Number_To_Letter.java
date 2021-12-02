package ss1.Bai_Tap;

import java.util.Scanner;

public class Number_To_Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number");
        int num = input.nextInt();
        String[] ldv = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] ten = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        String[] cht = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventies", "eighty", "ninety"};
        String tex = "";
        String num2 = Integer.toString(num);
        int hdv = 0;
        int hch = 0;
        int htr = 0;
        if (num >= 0) {
            if (num <= 9) {
                tex = ldv[num];
            } else if (num <= 20) {
                tex = ten[num - 10];
            } else if (num < 100) {
                if (num2.length() == 2) {
                    hch = Integer.parseInt(String.valueOf(num2.charAt(0)));
                    hdv = Integer.parseInt(String.valueOf(num2.charAt(1)));
                    tex = cht[hch - 1] + " " + ldv[hdv];
                    // System.out.println(tex);
                }
            } else if (num < 1000) {
                hdv = Integer.parseInt(String.valueOf(num2.charAt(2)));
                hch = Integer.parseInt(String.valueOf(num2.charAt(1)));
                htr = Integer.parseInt(String.valueOf(num2.charAt(0)));
                if (hdv == 0) {
                    tex = ldv[htr] + " hundred" + " and " + cht[hch - 1];
                } else if (hch==1){
                    tex = ldv[htr] + " hundred" + " and "  + ten[(hch*10+hdv)-10];
                }else {
                    tex = ldv[htr] + " hundred" + " " + cht[hch - 1] + " " + ldv[hdv];
                }
            }
        } else {
            System.out.println("phai nhập số dương");
        }
        System.out.println(tex);
        System.out.println(hch);
    }
}

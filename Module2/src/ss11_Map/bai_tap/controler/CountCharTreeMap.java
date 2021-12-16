package ss11_Map.bai_tap.controler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharTreeMap {
    public static void main(String[] args) {
        Map<Character, Integer> listTests = new HashMap<>();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter string: ");
        String texString = input.nextLine();
        char temp;
        for (int i=0;i<texString.length();i++){
            temp=texString.charAt(i);
            if (listTests.containsKey(temp)){
                int count=listTests.get(temp);
                listTests.put(temp,count+1);
            }else {
                listTests.put(temp,1);
            }
        }
        System.out.println(listTests);
    }
}

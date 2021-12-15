package ss10_DSA_Stack_Queue.bai_tap.service;

import java.util.Scanner;
import java.util.Stack;

public class StackService {
    private static int size;
    private static Scanner input=new Scanner(System.in);

    public static void stackOfIntegers(){
       Stack<Integer>  integerStack =new Stack<>();
        System.out.print("Enter n:  ");
        size= Integer.parseInt(input.nextLine());
        for (int i=0;i<size;i++){
            System.out.println("Enter value of index "+i+" : ");
            integerStack.push(Integer.parseInt(input.nextLine()));
        }
        Stack<Integer> integerStack1=new Stack<>();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*");
        while (!integerStack.isEmpty()){
            integerStack1.push(integerStack.peek());
            System.out.println(integerStack.pop());
        }
        System.out.println("/*/*/*/*/*/*/*/*/*/*/");
        while (!integerStack1.isEmpty()){
            System.out.println(integerStack1.pop());
        }
    }
    public static void stackOfString(){
        Stack<String> stringStack = new Stack<String>();
        System.out.println("Enter string:");
        String tex = input.nextLine();
        String[]array=tex.split("");
        for (int i=0;i< array.length;i++){
            stringStack.push(array[i]);
        }
        Stack<String> stringStack1=new Stack<>();
        while (!stringStack.isEmpty()){
            stringStack1.push(stringStack.peek());
            System.out.println(stringStack.pop());
        }
        while (!stringStack1.isEmpty()){
            System.out.println(stringStack1.pop());
        }
    }

}

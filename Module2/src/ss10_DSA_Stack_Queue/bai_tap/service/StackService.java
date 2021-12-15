package ss10_DSA_Stack_Queue.bai_tap.service;

import java.util.Scanner;
import java.util.Stack;

public class StackService {
    private static int size;
    private static Scanner input=new Scanner(System.in);
    private static Stack<Integer> integerStack;
    private static Stack<String> stringStack;
    public static void stackOfIntegers(){
         integerStack =new Stack<>();
        System.out.print("Enter n:  ");
        size= Integer.parseInt(input.nextLine());
        for (int i=0;i<size;i++){
            System.out.println("Enter value of index "+i+" : ");
            integerStack.push(Integer.parseInt(input.nextLine()));
        }
    }

    public void printStack() {
        while (!integerStack.isEmpty()){
            System.out.printf(integerStack.pop()+"\t");
        }
    }
}

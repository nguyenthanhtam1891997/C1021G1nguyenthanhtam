package ss10_DSA_Stack_Queue.thuc_hanh;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack=new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    }
    public int size(){
        return  stack.size();
    }
    private static void stackOfIStrings(){
        MyGenericStack<String> stack =new MyGenericStack<>();
        stack.push("Five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("One");
        System.out.println("1.1 size of stack after push operations: "+stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("\n1.3. size of stack after pop operations: "+stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack =new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 size of stack after push operations: "+stack.size());
        System.out.printf("2.2 pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %d",stack.pop());
        }
        System.out.println("\n3.3 size of stack after pop operations: "+stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. stack of Strings");
        stackOfIStrings();
    }
}

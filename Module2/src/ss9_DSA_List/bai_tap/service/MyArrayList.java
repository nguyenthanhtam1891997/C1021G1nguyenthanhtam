package ss9_DSA_List.bai_tap.service;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    Object[] elements;

    public MyArrayList() {
        elements=new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity "+capacity);
        }
    }
    public int getSize(){
        return this.size;
    }
    public void clear(){
        size=0;
        for (int i=0;i<elements.length;i++){
            elements[i]=null;
        }
    }
    public boolean add(E element){
        if (elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size]=element;
        size++;
        return true;
    }
    public void ensureCapacity(int minCapacity){
        if (minCapacity>=0){
            int newSize = this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("mincapacity "+minCapacity);
        }
    }
    public void add(E element,int index){
        if (index>elements.length){
            throw new IllegalArgumentException("index "+index);
        }else if (elements.length==size){
            this.ensureCapacity(5);
        }
        if (elements[index] != null) {
            for (int i = size + 1; i >= index; i++) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index]=element;
        size++;
    }
    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E element){
        int index=-1;
        for (int i=0;i<size;i++){
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
    public boolean contains(E element){
        return this.indexOf(element) >= 0;
    }
    public MyArrayList<E> clone(){
        MyArrayList<E> y=new MyArrayList<>();
        y.elements=Arrays.copyOf(this.elements,this.size);
        y.size=this.size;
        return y;
    }
    public E remove(int index){
        if (index<0||index>elements.length){
            throw new IllegalArgumentException("index: "+index);
        }
        E element = (E) elements[index];
        for (int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;

    }
}

package ss9_DSA_List.bai_tap.service;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        private Object getData(){
            return this.data;
        }
    }
    private Node head;
    private int numNode=0;

    public MyLinkedList() {
    }
    public void addFirst(E element){
      Node temp =head;
      head=new Node(element);
      head.next=temp;
      numNode++;
    }
    public void addLast(E element){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(element);
        numNode++;
    }
    public void add(int index,E element){
        Node temp=head;
        Node holder;
        for (int i=0;i<index-1&&temp.next!=null;i++){
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(element);
        temp.next.next=holder;
        numNode++;
    }
    public Object get(int index){
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public int size(){
        return numNode;
    }
    public E remove(int index){
        if (index<0||index>numNode){
            throw new IllegalArgumentException("index: "+index);
        }
        Node temp = head;
        Object data;
        if (index==0){
            data=temp.data;
            head=head.next;
        }else {
            for (int i=0;i<index-1&&temp.next!=null;i++){
                temp=temp.next;
            }
            data=temp.next.data;
            temp.next=temp.next.next;
        }
        numNode--;
        return (E) data;
    }
    public boolean remove(E element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node temp=head;
            while (temp.next !=null){
                if (temp.next.data.equals(element)){
                    temp.next=temp.next.next;
                    numNode--;
                    return true;
                }
                temp=temp.next;
            }
        }
        return false;
    }
    public MyLinkedList<E> clone(){
        if (numNode==0){
            throw new NullPointerException("null");
        }
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node temp=head;
        returnLinkedList.addFirst((E) temp.data);
        temp=temp.next;
        while (temp !=null){
            returnLinkedList.addLast((E) temp.data);
            temp=temp.next;
        }
        return returnLinkedList;
    }
    public boolean contains(E element){
        Node temp=head;
        while (temp !=null){
            if (temp.data.equals(element)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int indexOf(E element){
        Node temp=head;
        for (int i=0;i<numNode;i++){
            if (temp.data.equals(element)){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }
    public Object getFirst(){
        Node temp = head;
        return temp.data;
    }
    public Object getLast(){
        Node temp=head;
        for (int i=0;i<numNode;i++){
            temp=temp.next;
        }
        return temp.data;
    }
   public void clear(){
        Node temp=head;
       for (int i=0;i<numNode;i++){
           temp.data=null;
           temp=temp.next;
       }
       numNode=0;

   }
}

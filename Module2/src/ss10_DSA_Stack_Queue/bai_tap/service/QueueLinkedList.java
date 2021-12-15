package ss10_DSA_Stack_Queue.bai_tap.service;



public class QueueLinkedList {
    public class Node{
        public int data;
        public Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }
    private Node front;
    private Node rear;
    private int nunNode=0;

    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
    }
    public void enQueue(int data){
        Node temp = new Node(data);
        if (this.front==null){
            this.front=rear=temp;


        }else {
            this.rear.link = temp;
            rear = temp;
            temp.link=front;

        }

        nunNode++;
    }
    public Node deQueue(){
        if (this.front==null){
            return null;
        }
        Node temp=this.front;
        if (this.front==this.rear){
            front=rear=null;

        }else {
          front=front.link;
          rear.link=front;

        }
        nunNode--;

        return temp;
    }

    public void display() {
        Node temp = front;
        if (front == null) {
            System.out.println("null");
        } else {
            for (int i=0;i<nunNode;i++){
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }
}

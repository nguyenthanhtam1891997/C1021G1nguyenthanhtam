package ss10_DSA_Stack_Queue.bai_tap.controler;

import ss10_DSA_Stack_Queue.bai_tap.service.QueueLinkedList;


public class TextQueueLinkedList {
    public static void main(String[] args) {
        QueueLinkedList textQueue = new QueueLinkedList();
        textQueue.enQueue(4);
        textQueue.enQueue(3);
        textQueue.enQueue(2);
        textQueue.display();
        textQueue.deQueue();
        textQueue.deQueue();
        System.out.println("/*/*/*/*/*/*/*/*/");
        textQueue.display();


    }
}

package ss9_DSA_List.bai_tap.controler;

import ss9_DSA_List.bai_tap.model.Student;
import ss9_DSA_List.bai_tap.service.MyLinkedList;

public class TestLinkedList {
    public static void main(String[] args) {

        MyLinkedList<Student> studentMyLinkedList=new MyLinkedList<>();
        Student student1=new Student(1,"hung");
        Student student2=new Student(2,"kim");
        Student student3=new Student(3,"lan");
        Student student4=new Student(4,"dung");
        Student student5=new Student(5,"sao");
        studentMyLinkedList.addFirst(student1);
        studentMyLinkedList.addLast(student2);
        studentMyLinkedList.addLast(student3);
        studentMyLinkedList.addLast(student4);
        MyLinkedList<Student> studentMyLinkedList1=new MyLinkedList<>();
        studentMyLinkedList1=studentMyLinkedList.clone();
        studentMyLinkedList.clear();

        for (int i=0;i<studentMyLinkedList.size();i++){
            Student student= (Student) studentMyLinkedList.get(i);
            System.out.println(student.getName());

        }
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        for (int i=0;i<studentMyLinkedList1.size();i++){
            Student student=(Student) studentMyLinkedList1.get(i);
            System.out.println(student.getName());
        }


//        System.out.println(studentMyLinkedList.contains(student4));
//        System.out.println(studentMyLinkedList.indexOf(student2));

    }
}

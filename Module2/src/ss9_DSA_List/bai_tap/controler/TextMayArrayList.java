package ss9_DSA_List.bai_tap.controler;

import ss9_DSA_List.bai_tap.model.Student;
import ss9_DSA_List.bai_tap.service.MyArrayList;

public class TextMayArrayList {
    public static void main(String[] args) {
        MyArrayList<Student> studentMyArrayList=new MyArrayList<>();
        Student student1=new Student(1,"kim");
        Student student2=new Student(2,"hung");
        Student student3=new Student(3,"dung");
        Student student4=new Student(4,"loi");
        Student student5=new Student(5,"sao");
        Student student6=new Student(6,"dung");

        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);

      //  System.out.println(studentMyArrayList.get(2).getId());
        studentMyArrayList.remove(2);
        MyArrayList<Student> studentMyArrayList1;
        studentMyArrayList1=studentMyArrayList.clone();
        studentMyArrayList.clear();

        for (int i=0;i<studentMyArrayList.getSize();i++){
            System.out.println(studentMyArrayList.get(i).getName());
        }
        for (int i=0;i<studentMyArrayList1.getSize();i++){
            System.out.println(studentMyArrayList1.get(i));
        }


    }
}

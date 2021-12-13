package bai_Tap_Them.bai2.service;

import bai_Tap_Them.bai2.model.Student;


import java.util.*;

public class StudentServiceImpl implements IStudentService {
    private Student[] studentList = new Student[20];
    private static Scanner input =new Scanner(System.in);
    private static int count=0;
    @Override
    public void addNewStudent() {
        if (count<studentList.length){
            System.out.println("Enter code");
            String code = input.nextLine();
            System.out.println("Enter name");
            String name =input.nextLine();
            System.out.println("Enter Day Of Birth");
            String dayOfBirth = input.nextLine();
            System.out.println("Enter Male");
            String male = input.nextLine();
            System.out.println("Enter class");
            String course = input.nextLine();
            Student student = new Student(code,name,dayOfBirth,male,course);
            studentList[count]=student;
            count++;
        }else {
            System.out.println("Full list student");
        }
    }

    @Override
    public void getListStudent() {
        for (Student student:studentList){
            if (student==null){
                break;
            }
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Enter code of student");
        String moveCode= input.nextLine();
       for (int i=0;i<studentList.length;i++){
           if (studentList[i].getCode().equals(moveCode)){
               for (int j=i;j<studentList.length;j++){
                   studentList[j]=studentList[j+1];
               }
               count--;
               break;
           }
       }
    }

    @Override
    public void removeAnyStudent() {
        System.out.println("Enter position student");
        int anyStudent= Integer.parseInt(input.nextLine());
        for (int i=0;i<studentList.length;i++){
            if (count==anyStudent-1){
                for (int j=i;j<studentList.length;j++){
                    studentList[j]=studentList[j+1];
                }
                count--;
                break;
            }
        }
    }

    @Override
    public void searchStudent() {
        System.out.println("Enter you search");
        String search= String.valueOf(input.nextLine().charAt(0));
        boolean check=true;
        if (check) {
            for (Student student : studentList) {
                if (student.getCode().contains(search)) {
                    System.out.println(student);
                } else {
                    System.out.println("not found in student code continued potential in student name  ");
                    check=false;
                }
            }
        }else {
            for (Student student:studentList){
                if (student.getName().contains(search)){
                    System.out.println(student);
                }
                else {
                    System.out.println("No students found with this keyword: "+search);
                }
            }
        }
    }

    @Override
    public void sortStudentList() {
        Student[] newStudentList=new Student[count];
        for (int i=0;i<newStudentList.length;i++){
            if (studentList[i]!=null){
                newStudentList[i]=studentList[i];
            }
        }
        Arrays.sort(newStudentList);
        studentList=newStudentList;//




//        List<Student> newStudentList = new ArrayList<>();
//        for (int i=0;i<studentList.length;i++){
//            if (studentList[i]!=null){
//                newStudentList.add(studentList[i]);
//            }
//        }
//        Collections.sort(newStudentList);
//        for (Student student:newStudentList){
//            System.out.println(student);
//        }


//        Collections.sort(studentList);
//      // Arrays.sort(studentList);
//       getListStudent();
    }



}

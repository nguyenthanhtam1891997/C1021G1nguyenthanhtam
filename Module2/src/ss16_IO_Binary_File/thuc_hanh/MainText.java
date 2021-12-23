package ss16_IO_Binary_File.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainText {

    public static final String LINKED_STUDENT_FILE = "D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\ss16_IO_Binary_File\\thuc_hanh\\studentFile.txt";

    public static void writeToObject(String path, List<Student> students){
        try {
            FileOutputStream fos =new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readFromObject(String path){
        List<Student> studentList=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            studentList= (List<Student>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,"Vũ kiều anh","Hà nội"));
        studentList.add(new Student(2,"Nguyễn Minh Quân","Hà nội"));
        studentList.add(new Student(3,"Đặng Huy Hoà","Đà Nẵng"));
        studentList.add(new Student(4,"Nguyễn Khánh Tùng","Hà nội"));
        writeToObject(LINKED_STUDENT_FILE,studentList);
        List<Student> studentDataFile=readFromObject(LINKED_STUDENT_FILE);
        for (Student student:studentDataFile){
            System.out.println(student.getName());
        }
    }
}

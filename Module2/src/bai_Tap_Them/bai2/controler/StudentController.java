package bai_Tap_Them.bai2.controler;

import bai_Tap_Them.bai2.service.IStudentService;
import bai_Tap_Them.bai2.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        IStudentService iStudentService =new StudentServiceImpl();
        do{
            System.out.println("__Student Menu__");
            System.out.println("1. Add student");//Print list student
            System.out.println("2. Removed student with code");
            System.out.println("3. Removed any student");
            System.out.println("4. Search student ");
            System.out.println("5. Print list student");
            System.out.println("6. Sort list student with code");
            System.out.println("11. Exit");
            int select = Integer.parseInt(input.nextLine());

            switch (select) {
                case 1:
                    iStudentService.addNewStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.removeAnyStudent();
                    break;
                case 4:
                    iStudentService.searchStudent();
                    break;
                case 5:
                    iStudentService.getListStudent();
                    break;
                case 6:
                    iStudentService.sortStudentList();
                    break;

                case 11:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}

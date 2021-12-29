package caseStudy.service.person.employee.impl;

import caseStudy.model.person.Employee;
import caseStudy.service.person.employee.EmployeeService;

import java.io.*;

import java.util.*;


public class EmployeeServiceImpl implements EmployeeService {
private static List<Employee> employeeList=new ArrayList<>();
 {
    employeeList=readEmploy();
}
private static Scanner input=new Scanner(System.in);
private static final String  DAY_OF_BIRTH= "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
private static final String PHONE_NUMBER="0[397][0379][0-9]{7}";
private static final String EMAIL="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
private static final String ID_CITIZEN="20[0-9]{7}";
private static final String FILE_EMPLOY="D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\caseStudy\\model\\employeeFile.csv";
    @Override
    public void display() {
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
        System.out.print("Enter id:");
        String id = input.nextLine();
        System.out.print("Enter name:");
        String name = input.nextLine();
        String dayOfBirth = enterDayOfBirth();
        String idCitizen = enterIdCitizen();
        String phoneNumber = enterPhoneNumber();
        String email = enterEmail();
        String lever = enterLever();
        String position = enterPosition();
        System.out.print("Enter salary:");
        double salary = Double.parseDouble(input.nextLine());
        String gender = enterGender();
        Employee employee = new Employee(id, name, dayOfBirth, idCitizen, phoneNumber, email, lever, position, salary, gender);
        employeeList = readEmploy();
        employeeList.add(employee);
        Collections.sort(employeeList);
        writeFile();
    }

    @Override
    public void edit() {
        boolean check = false;
        do {

            try {
                System.out.print("Enter id you want to change:");
                String idFind=input.nextLine();

                for (int i=0;i<employeeList.size();i++){
                    if (employeeList.get(i).getId().equals(idFind)){
                        System.out.print("Enter id:");
                        String id = input.nextLine();
                        System.out.print("Enter name:");
                        String name = input.nextLine();
                        String dayOfBirth = enterDayOfBirth();
                        String idCitizen = enterIdCitizen();
                        String phoneNumber = enterPhoneNumber();
                        String email = enterEmail();
                        String lever = enterLever();
                        String position = enterPosition();
                        System.out.print("Enter salary:");
                        double salary = Double.parseDouble(input.nextLine());
                        String gender = enterGender();
                        Employee employee = new Employee(id, name, dayOfBirth, idCitizen, phoneNumber, email, lever, position, salary, gender);
                        employeeList = readEmploy();
                        employeeList.set(i, employee);
                        Collections.sort(employeeList);
                        writeFile();
                        check=false;
                        break;
                    }else {
                        check=true;
                    }
                }
                if (check){
                    System.out.println("not find");
                }else {
                    break;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("vượt quá số lượng phần tử ");

            }catch (NumberFormatException e){
                e.printStackTrace();

            }
        }while (true);

    }

    @Override
    public void delete() {
                boolean check=false;
                do {
                    try {

                        System.out.print("Enter id you want to delete:");
                        String idDelete = input.nextLine();

                        for (int i=0;i<employeeList.size();i++) {
                            if (employeeList.get(i).getId().equals(idDelete)) {
                                employeeList.remove(i);
                                Collections.sort(employeeList);
                                writeFile();
                                check=false;
                                break;

                            }else {
                                check=true;
                            }
                        }
                        if (check){
                            System.out.println("not find");
                        }else {
                            break;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("vượt quá số lượng phần tử ");


                    } catch (NumberFormatException | IndexOutOfBoundsException  e) {
                        System.out.println("loi dã duoxj khac phục");

                    }
                }while (true);

    }

    private String enterDayOfBirth() {
        String dayOfBirth;
        boolean check;
        do {
            check = false;
            System.out.print("Enter day of birth:");
            dayOfBirth = input.nextLine();
            if (dayOfBirth.matches(DAY_OF_BIRTH)) {
                String[] dayOfBirthList = dayOfBirth.split("/");
                int day = Integer.parseInt(dayOfBirthList[0]);
                int month = Integer.parseInt(dayOfBirthList[1]);
                int year = Integer.parseInt(dayOfBirthList[2]);
                if (year%4==0&&year%1001!=0||year%400==0){
                    if (month==2){
                        if (day>29){
                            System.out.println("you day off is not true");
                            check=true;
                        }
                    }
                }
               if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                   if (day<1||day>31){
                       System.out.println("you day off birth is not true");
                       check=true;
                   }
               }else if (month==4||month==6||month==9||month==11){
                   if (day<1||day>30){
                       System.out.println("you day off birth is not true");
                       check=true;
                   }
               }
            }else {
                System.out.println("you day off birth is not true");
                check=true;
            }
        } while (check);
        return dayOfBirth;
    }

    private String enterPhoneNumber() {
        String phoneNumber;
        boolean check;
        do {
            check=false;
            System.out.print("Enter phone number:");
            phoneNumber = input.nextLine();

            if (!phoneNumber.matches(PHONE_NUMBER)) {
                check = true;
                System.out.println("you number is not true");
            }
        } while (check);
        return phoneNumber;
    }

    private String enterEmail() {
        String eEmail = null;
        boolean check ;
        do {
            check = false;
            System.out.print("Enter email:");
            eEmail = input.nextLine();
            if (!eEmail.matches(EMAIL)) {
                check = true;
                System.out.println("you email is not true");
            }
        } while (check);
        return eEmail;
    }

    private String enterLever() {
        String lever = null;
        System.out.println("__Lever Menu__");
        System.out.println("1. Intermediate");
        System.out.println("2. High School");
        System.out.println("3. University");
        System.out.println("4. After university");
        int choice = Integer.parseInt(input.nextLine());
        do {
            switch (choice) {
                case 1:
                    lever = "Intermediate";
                    break;
                case 2:
                    lever = "High School";
                    break;
                case 3:
                    lever = "University";
                    break;
                case 4:
                    lever = "After university";
                    break;

            }
        } while (choice > 5);

        return lever;
    }

    private String enterPosition() {
        String position = null;
        System.out.println("__Position Menu__");
        System.out.println("1. serve");
        System.out.println("2. manager");
        System.out.println("3. monitor");
        System.out.println("4.receptionist");
        System.out.println("5. manage");
        int choice = Integer.parseInt(input.nextLine());
        do {
            switch (choice) {
                case 1:
                    position = "serve";
                    break;
                case 2:
                    position = "manager";
                    break;
                case 3:
                    position = "monitor";
                    break;
                case 4:
                    position = "receptionist";
                    break;
                case 5:
                    position = "manage";
                    break;
            }
        }while (choice<0||choice>5);

        return position;
    }

    private String enterGender(){
        String gender=null;
        System.out.println("__Gender Menu__");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. LJPT");
        int choice=Integer.parseInt(input.nextLine());
        do {
            switch (choice){
                case 1:
                    gender="Male";
                    break;
                case 2:
                    gender="Female";
                    break;
                case 3:
                    gender="LJPT";
                    break;
            }
        }while (choice>3||choice<0);

        return gender;

    }

    private String enterIdCitizen(){
        String idCitizen;
        boolean check;
        do {
            check=false;
            System.out.print("Enter ID citizen:");
            idCitizen = input.nextLine();
            if (!idCitizen.matches(ID_CITIZEN)){
                check = true;
                System.out.println("you ID Citizen is not true");
            }
        }while (check);
        return idCitizen;
    }

    private  List<Employee> readEmploy(){
        List<Employee> employeeList1=new ArrayList<Employee>();
        FileReader fileReader;
        try {
            fileReader=new FileReader(FILE_EMPLOY);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            String temp[];
            Employee employee;
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(",");
                employee=new Employee(temp[0],temp[1],temp[2],temp[3],
                        temp[4],temp[5], temp[6],temp[7],Double.parseDouble(temp[8]),temp[9] );
                employeeList1.add(employee);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("mãng dang rỗng");
        }
        return employeeList1;
    }
    private void writeFile(){
        try {
            FileWriter fileWriter=new FileWriter(FILE_EMPLOY);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line= null;
            for (Employee employee:employeeList){
                line=employee.getId()+","+employee.getName()+","+employee.getDayOfBirth()+","+employee.getIdCitizen()+","
                        +employee.getPhoneNumber()+","+employee.getEmail()+","+employee.getLevel()+","+employee.getPosition()+","
                        +employee.getSalary()+","+employee.getGender()+"\n";
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

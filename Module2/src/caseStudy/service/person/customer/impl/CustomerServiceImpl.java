package caseStudy.service.person.customer.impl;

import caseStudy.model.person.Customer;

import caseStudy.service.person.customer.CustomerService;


import java.io.*;
import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList=new LinkedList<>();
    {
        customerList=readCustomer();
    }
    private static Scanner input=new Scanner(System.in);
    private static final String  DAY_OF_BIRTH= "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
    private static final String PHONE_NUMBER="0[397][0379][0-9]{7}";
    private static final String EMAIL="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String ID_CITIZEN="20[0-9]{7}";
    private static final String FILE_CUSTOMER="D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\caseStudy\\model\\customerFile.csv";
    @Override
    public void display() {
        for (Customer customer:customerList){
            System.out.println(customer);
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
        String typeCustomer=enterTypeCustomer();
        System.out.println("Enter address");
        String addressService=input.nextLine();
        Customer customer=new Customer(id,name,dayOfBirth,idCitizen,phoneNumber,email,typeCustomer,addressService);
        customerList=readCustomer();
        customerList.add(customer);
        Collections.sort(customerList);
        writeFile();
    }

    @Override
    public void edit() {
        boolean check=false;
        do {
            try {
                System.out.print("Enter id you wan to change:");
                String idFind=input.nextLine();
                for (int i=0;i<customerList.size();i++){
                    if (customerList.get(i).getId().equals(idFind)){
                        System.out.print("Enter id:");
                        String id = input.nextLine();
                        System.out.print("Enter name:");
                        String name = input.nextLine();
                        String dayOfBirth = enterDayOfBirth();
                        String idCitizen = enterIdCitizen();
                        String phoneNumber = enterPhoneNumber();
                        String email = enterEmail();
                        String typeCustomer=enterTypeCustomer();
                        System.out.println("Enter address");
                        String addressService=input.nextLine();
                        Customer customer=new Customer(id,name,dayOfBirth,idCitizen,phoneNumber,email,typeCustomer,addressService);
                        customerList=readCustomer();
                        customerList.set(i,customer);
                        Collections.sort(customerList);
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
                System.out.println("vượt quá số lượng phần tử");
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
                System.out.println("Enter id you wan to delete:");
                String idDelete=input.nextLine();
                for (int i=0;i<customerList.size();i++){
                    if (customerList.get(i).getId().equals(idDelete)){
                        customerList.remove(i);
                        Collections.sort(customerList);
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
                System.out.println("vượt quá số phần tử ");
            }catch (NumberFormatException | IndexOutOfBoundsException | ConcurrentModificationException e){
                System.out.println("loi không có phần tử trong mãng ");
            }
        }while (true);

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
    private String enterDayOfBirth() {
        String  dayOfBirth;
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
    private String enterTypeCustomer(){
        String typeCustomer=null;
        System.out.println("__Customer Menu__");
        System.out.println("1. Diamond");
        System.out.println("2. Platinum");
        System.out.println("3. Gold");
        System.out.println("4. Silver");
        System.out.println("3. Member");
        int choice=Integer.parseInt(input.nextLine());
        do {
            switch (choice){
                case 1:
                    typeCustomer="Diamond";
                    break;
                case 2:
                    typeCustomer="Platinum";
                    break;
                case 3:
                    typeCustomer="Gold";
                    break;
                case 4:
                    typeCustomer="Silver";
                    break;
                case 5:
                    typeCustomer="Member";
                    break;

            }
        }while (choice>5||choice<1);
        return typeCustomer;

    }

    private  List<Customer> readCustomer(){
        List<Customer> CustomerList1=new ArrayList<Customer>();
        FileReader fileReader;
        try {
            fileReader=new FileReader(FILE_CUSTOMER);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            String temp[];
            Customer Customer;
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(",");
                Customer=new Customer(temp[0],temp[1],temp[2],temp[3],
                        temp[4],temp[5], temp[6],temp[7]);
                CustomerList1.add(Customer);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("mãng đang rỗng ");
        }
        return CustomerList1;
    }
    private void writeFile(){
        try {
            FileWriter fileWriter=new FileWriter(FILE_CUSTOMER);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line=null;
            for (Customer customer:customerList){
                line= customer.getId()+","+customer.getName()+","+customer.getDayOfBirth()+","+customer.getIdCitizen()
                        +","+customer.getPhoneNumber()+","+customer.getEmail()+","+ customer.getTypeCustomer()+","+customer.getAddressService()+"\n";
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

package caseStudy.service.facility.impl;

import caseStudy.model.facility.FuramaFacility;

import caseStudy.service.facility.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<FuramaFacility,Integer> facilityList = new LinkedHashMap<>();
    private static Scanner input=new Scanner(System.in);
    private static final String ID_FACILITY="[SV](VL|HO|RO)[0-9]{4}";
    private static final String NAME_VILA ="(VILA)[0-9]{1,2}";
    private static final String NAME_ROOM ="(ROOM)[0-9]{1,2}";
    private static final String NAME_HOME ="(HOME)[0-9]{1,2}";
    private String idFacility;
    @Override
    public void display() {

    }

    @Override
    public void displayError() {

    }
//    String nameService, double areaUsable, double costsRental,
//    int maxPeople, String typeRental, String standardRoom,
//    double areaPool, int numberFloors
    @Override
    public void addNewVilla() {

        idFacility = enterIdFacility();
        String name = enterName();
        double areaUsable= enterAreaUsable();
        double costsRental=enterMoney();
        int maxPeople=enterPeople();

//        String phoneNumber = enterPhoneNumber();
//        String email = enterEmail();
//        String typeCustomer=enterTypeCustomer();
//        System.out.println("Enter address");
//        String addressService=input.nextLine();
//        Customer customer=new Customer(id,name,dayOfBirth,idCitizen,phoneNumber,email,typeCustomer,addressService);
//        customerList=readCustomer();
//        customerList.add(customer);
//        Collections.sort(customerList);
//        writeFile();
    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
    private String enterIdFacility(){
        String idFacility=null;
        boolean check=false;
        do {
            System.out.println("Enter id facility");
            idFacility="SV"+input.nextLine();
            if (!idFacility.matches(ID_FACILITY)){
                check=true;
                System.out.println("You id is not true");
            }
        }while (check);

        return idFacility;
    }
    private String enterName(){
        String name=null;
        boolean check=false;
        boolean checkOut=false;
        String firstLetter=String.valueOf(idFacility.charAt(2));
        do {
            if (firstLetter.equals("V")){
                do {
                    System.out.println("Enter name ");
                    name=input.nextLine();
                    String s1=name.substring(0,1).toUpperCase();
                    name=s1+name.substring(1);

                    if (!name.matches(NAME_VILA)){
                        check=true;
                        System.out.println("you name is not true");
                    }
                }while (check);
            }else if (firstLetter.equals("H")){
                do {
                    System.out.println("Enter name ");
                    name=input.nextLine();
                    String s1=name.substring(0,1).toUpperCase();
                    name=s1+name.substring(1);
                    if (!name.matches(NAME_HOME)){
                        check=true;
                        System.out.println("you name is not true");
                    }
                }while (check);
            }else if (firstLetter.equals("R")){
                do {
                    System.out.println("Enter name ");
                    name=input.nextLine();
                    String s1=name.substring(0,1).toUpperCase();
                    name=s1+name.substring(1);
                    if (!name.matches(NAME_ROOM)){
                        check=true;
                        System.out.println("you name is not true");
                    }
                }while (check);
            }else {
                System.out.println("name is not true");
                checkOut=true;
            }
        }while (checkOut);
        return name;
    }
    private double enterAreaUsable(){
        double area = 0;
        boolean check=false;
        do {
            try {
                System.out.println("Enter Area");
                area=Double.parseDouble(input.nextLine());
                if (area>30){
                    check=true;
                    System.out.println("you area is not true ");
                }
            }catch (NumberFormatException e){
                System.out.println("số không đúng định dạng");
            }
        }while (check);
        return area;
    }
    private double enterMoney(){
        double money = -1;
        do {
            try {
                System.out.println("Enter money");
                money=Double.parseDouble(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("só không đúng định dạng");
            }

        }while (money<0);
        return money;
    }
    private int enterPeople(){
        int peoples = 0;
        boolean check;
        do {
            try {
                check=false;
                System.out.println("Enter people");
                peoples=Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("số không dúng định dạnh");
                check=true;
            }
        }while (check);
        return peoples;
    }
    private int enterFloor(){
        int floor=0;
        do {
            try {
                System.out.println("Enter floor");
                floor=Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("số không dúng định dạnh");
            }
        }while (floor<=0);
        return  floor;
    }
}

package caseStudy.service.facility.impl;

import caseStudy.model.booking_contract.Booking;
import caseStudy.model.facility.FuramaFacility;

import caseStudy.model.facility.House;
import caseStudy.model.facility.Room;
import caseStudy.model.facility.Villa;
import caseStudy.service.booking_contract.impl.BookingServiceImpl;
import caseStudy.service.facility.FacilityService;

import java.io.*;
import java.sql.PreparedStatement;
import java.util.*;


public class FacilityServiceImpl implements FacilityService {
    private static Map<FuramaFacility,Integer> facilityList = new LinkedHashMap<>();
    private static Map<FuramaFacility,Integer> facilityListBooking = BookingServiceImpl.changeFacility();
    private static List<FuramaFacility> vilaList=new ArrayList<>();
    private static List<FuramaFacility> houseList=new ArrayList<>();
    private static List<FuramaFacility> roomList=new ArrayList<>();

    private static Scanner input=new Scanner(System.in);
    private static final String ID_FACILITY="SV(VL|HO|RO)[0-9]{4}";
    private static final String NAME_VILA ="(VILA)[0-9]{1,2}";
    private static final String NAME_ROOM ="(ROOM)[0-9]{1,2}";
    private static final String NAME_HOME ="(HOME)[0-9]{1,2}";
    public static final String VILA_FILE ="D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\caseStudy\\model\\data\\vilaFile.csv";
    public static final String ROOM_FILE ="D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\caseStudy\\model\\data\\roomFile.csv";
    public static final String HOME_FILE ="D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\caseStudy\\model\\data\\houseFile.csv";
    private String idFacility;

    static {
        vilaList=readFurama(VILA_FILE);
        houseList=readFurama(HOME_FILE);
        roomList=readFurama(ROOM_FILE);
        for (FuramaFacility vila:vilaList){
            facilityList.put(vila,0);
        }
        for (FuramaFacility house:houseList){
            facilityList.put(house,0);
        }
        for (FuramaFacility room:roomList){
            facilityList.put(room,0);
        }

    }
    @Override
    public void display() {
        boolean check;
        int choice=0;
        do {
            check=false;
            System.out.println("___MENU DISPLAY___");
            System.out.println("1. DISPLAY VILA");
            System.out.println("2. DISPLAY HOUSE");
            System.out.println("3. DISPLAY ROOM");
            System.out.println("4. DISPLAY ALL");
            System.out.print("Enter you choice:");
            try {
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        displayVilla();
                        break;
                    case 2:
                        displayHome();
                        break;
                    case 3:
                        displayRoom();
                        break;
                    case 4:
                        displayVilla();
                        displayHome();
                        displayRoom();
                        break;
                    default:
                        System.out.println("Choice number is not true");
                }
            } catch (NumberFormatException e) {
                System.out.println("số không đúng định dạng");
                check = true;
            }
        }while (check||choice<1||choice>4);

    }
    private static void displayVilla() {
        for (Map.Entry<FuramaFacility, Integer> facilityIntegerEntry : facilityList.entrySet()) {
            if (facilityIntegerEntry.getKey() instanceof Villa) {
                System.out.println(facilityIntegerEntry.getKey());
            }
        }
    }
    private static void displayRoom(){
        for (Map.Entry<FuramaFacility, Integer> facilityIntegerEntry : facilityList.entrySet()) {
            if (facilityIntegerEntry.getKey() instanceof Room) {
                System.out.println(facilityIntegerEntry.getKey());
            }
        }
    }
    private static void displayHome(){
        for (Map.Entry<FuramaFacility, Integer> facilityIntegerEntry : facilityList.entrySet()) {
            if (facilityIntegerEntry.getKey() instanceof House) {
                System.out.println(facilityIntegerEntry.getKey());
            }
        }
    }



    @Override
    public  void displayError() {

        for (Map.Entry<FuramaFacility,Integer> entry: facilityListBooking.entrySet()){
            if (entry.getValue()==5){
                System.out.print(entry.getKey()+"\t");
                System.out.println(entry.getValue());
                System.out.println("đang bao trì ");

            }
        }
    }

    @Override
    public void addNewVilla() {
        idFacility = enterIdFacility();
        String name = enterName();
        double areaUsable= enterAreaUsable();
        double costsRental=enterMoney();
        int maxPeople=enterPeople();
        int floors=enterFloor();
        String typeRental=enterTypeRental();
        String typeRoom=enterStandardRoom();
        double areaPool=enterAreaUsable();
        FuramaFacility vila=new Villa(idFacility,name,areaUsable,costsRental,maxPeople,typeRental,typeRoom,areaPool,floors);
        vilaList=readFurama(VILA_FILE);
        vilaList.add(vila);
        facilityList.put(vila,1);
        writeFileVila();
    }

    @Override
    public void addNewHouse() {
        idFacility = enterIdFacility();
        String name = enterName();
        double areaUsable= enterAreaUsable();
        double costsRental=enterMoney();
        int maxPeople=enterPeople();
        int floors=enterFloor();
        String typeRental=enterTypeRental();
        String typeRoom=enterStandardRoom();
        double areaPool=enterAreaUsable();
        FuramaFacility house=new House(idFacility,name,areaUsable,costsRental,maxPeople,typeRental,typeRoom,floors);
        houseList.add(house);
        facilityList.put(house,1);
        writeFileHouse();
    }

    @Override
    public void addNewRoom() {
        idFacility = enterIdFacility();
        String name = enterName();
        double areaUsable = enterAreaUsable();
        double costsRental = enterMoney();
        int maxPeople = enterPeople();
        String typeRental = enterTypeRental();
        String freeService = enterFreeService();
        FuramaFacility room = new Room(idFacility, name, areaUsable, costsRental, maxPeople, typeRental, freeService);

        roomList.add(room);
        facilityList.put(room, 1);
        writeFileRoom();
    }
    private String enterIdFacility(){
        String idFacility=null;
        boolean check;
        do {
            check=false;
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
                    check=false;
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
                    check=false;
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
                    check=false;
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
                check=false;
                System.out.print("Enter Area:");
                area=Double.parseDouble(input.nextLine());
                if (area<30){
                    check=true;
                    System.out.println("you area is not true ");
                }
            }catch (NumberFormatException e){
                System.out.println("số không đúng định dạng");
            }
        }while (check||area<0);
        return area;
    }
    private double enterMoney(){
        double money = -1;
        boolean check;
        do {
            try {
                check=false;
                System.out.print("Enter money");
                money=Double.parseDouble(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("só không đúng định dạng");
                check=true;
            }

        }while (check||money<0);
        return money;
    }
    private int enterPeople(){
        int peoples = 0;
        boolean check;
        do {
            try {
                check=false;
                System.out.print("Enter people");
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
        boolean check;
        do {
            try {
                check=false;
                System.out.print("Enter floor");
                floor=Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("số không dúng định dạnh");
                check=true;
            }
        }while (check||floor<0);
        return  floor;
    }
    private String enterTypeRental(){
        String typeRental=null;
        boolean check;
        int choice=0;
        do{
            check=false;
            System.out.println("__Choice type rental__");
            System.out.println("1. YEAR");
            System.out.println("2. MONTH");
            System.out.println("3. DAY");
            System.out.println("4. HOUR");
            try {
                System.out.print("Enter you choice:");
                choice=Integer.parseInt(input.nextLine());
                switch (choice){
                    case 1:
                        typeRental="YEAR";
                        break;
                    case 2:
                        typeRental="MONTH";
                        break;
                    case 3:
                        typeRental="DAY";
                        break;
                    case 4:
                        typeRental="HOUR";
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("số không đúng định dạng");
                check=true;
            }

        }while (check||choice<1||choice>4);
      return typeRental;
    }
    private String enterStandardRoom(){
        String typeRom=null;
        boolean check;
        int choice=0;
        do {check=false;
            System.out.println("__Choice type room__");
            System.out.println("1. VIP ROOM");
            System.out.println("2. NORMAL ROOM");
            System.out.println("3. Standard ROOM");

            try {
                System.out.print("Enter you choice:");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        typeRom = "VIP";
                        break;
                    case 2:
                        typeRom = "NORMAL";
                        break;
                    case 3:
                        typeRom = "STANDARD";
                        break;
                    default:
                        System.out.println("");
                }
            } catch (NumberFormatException e) {
                System.out.println("số không đúng định dạng");
                check = true;
            }
        }while (check||choice<1||choice>3);
        return typeRom;
    }
    private String enterFreeService(){
        String freeService=null;
        boolean check;
        int choice=0;
        do {
            check=false;
            System.out.println("__Choice Free Service__");
            System.out.println("1. Water");
            System.out.println("2. CONDOM");
            System.out.println("3. Wish Towel");

            try {
                System.out.print("Enter you choice:");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        freeService = "Water";
                        break;
                    case 2:
                        freeService = "CONDOM";
                        break;
                    case 3:
                        freeService = "Wish Towel";
                        break;
                    default:
                        System.out.println("you choice is not true");

                }
            } catch (NumberFormatException e) {
                System.out.println("số không đúng định dạng");
                check = true;
            }
        }while (check||choice<1||choice>3);
        return freeService;

    }
    //    String nameService, double areaUsable, double costsRental,
//    int maxPeople, String typeRental, String standardRoom,
//    double areaPool, int numberFloors

    public static void writeFileVila(){
        try {
            FileWriter   fileWriter = new FileWriter(VILA_FILE);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String line=null;
            for (Map.Entry<FuramaFacility,Integer> entry: facilityList.entrySet()){
                if (entry.getKey() instanceof Villa){
                    Villa villa=(Villa) entry.getKey();
                    line=villa.getIdFacility()+","+villa.getNameService()+","+villa.getAreaUsable()+","+
                            villa.getCostsRental()+","+villa.getMaxPeople()+","+villa.getTypeRental()+","+
                            villa.getStandardRoom()+","+villa.getAreaPool()+","+villa.getNumberFloors()+"\n";
                    bufferedWriter.write(line);
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileHouse(){
        try {
            FileWriter   fileWriter = new FileWriter(HOME_FILE);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String line=null;
            for (Map.Entry<FuramaFacility,Integer> entry: facilityList.entrySet()){
                if (entry.getKey() instanceof House){
                    House house =(House) entry.getKey();
                    line=house.getIdFacility()+","+house.getNameService()+","+house.getAreaUsable()+","+
                            house.getCostsRental()+","+house.getMaxPeople()+","+house.getTypeRental()+","+
                            house.getStandardRoom()+","+house.getNumberFloors()+"\n";
                    bufferedWriter.write(line);
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileRoom(){
        try {
            FileWriter   fileWriter = new FileWriter(ROOM_FILE);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String line=null;
            for (Map.Entry<FuramaFacility,Integer> entry: facilityList.entrySet()){
                if (entry.getKey() instanceof Room){
                    Room room=(Room) entry.getKey();
                    line=room.getIdFacility()+","+room.getNameService()+","+room.getAreaUsable()+","+
                            room.getCostsRental()+","+room.getMaxPeople()+","+room.getTypeRental()+","+
                            room.getFreeService()+"\n";
                    bufferedWriter.write(line);
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<FuramaFacility> readFurama(String nameFile) {
 //       Map<FuramaFacility, Integer> furamaList = new LinkedHashMap<>();
        List<FuramaFacility> furamaList1=new ArrayList<>();
        List<FuramaFacility> furamaList2=new ArrayList<>();
        List<FuramaFacility> furamaList3=new ArrayList<>();
        FileReader fileReader;
        int choice=0;
        try {
            String line;
            String temp[];
            fileReader = new FileReader(nameFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String id= String.valueOf(temp[0].charAt(2));
                if (id.equals("V") ) {
                    choice=1;
                    FuramaFacility vila = new Villa(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]),
                            Integer.parseInt(temp[4]), temp[5], temp[6], Double.parseDouble(temp[7]), Integer.parseInt(temp[8]));
                    furamaList1.add(vila);
                } else if (id.equals("H")) {
                    choice=2;
                    FuramaFacility house = new House(temp[0], temp[1], Double.parseDouble(temp[2]),
                            Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]));
                    furamaList2.add(house);
                } else if (id.equals("R")) {
                    choice=3;
                    FuramaFacility room = new Room(temp[0], temp[1], Double.parseDouble(temp[2]),
                            Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6]);
                    furamaList3.add(room);
                }
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("số không dúng định dạng");
        }
        if (choice==1){
            return furamaList1;
        }else if (choice==2){
            return furamaList2;
        }else  {
            return furamaList3;
        }

    }
    public static Map<FuramaFacility,Integer> setListFurama(){
        Map<FuramaFacility,Integer> list = new LinkedHashMap<>();
        vilaList=readFurama(VILA_FILE);
        houseList=readFurama(HOME_FILE);
        roomList=readFurama(ROOM_FILE);
        for (FuramaFacility vila:vilaList){
            list.put(vila,0);
            System.out.println(vila);
        }
        for (FuramaFacility house:houseList){
            list.put(house,0);
        }
        for (FuramaFacility room:roomList){
            list.put(room,0);
        }
        return list;
    }

}

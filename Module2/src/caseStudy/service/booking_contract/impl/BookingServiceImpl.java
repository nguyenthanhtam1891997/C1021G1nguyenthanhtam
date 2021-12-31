package caseStudy.service.booking_contract.impl;

import caseStudy.model.booking_contract.Booking;
import caseStudy.model.facility.FuramaFacility;
import caseStudy.model.facility.House;
import caseStudy.model.facility.Room;
import caseStudy.model.facility.Villa;
import caseStudy.model.person.Customer;
import caseStudy.service.booking_contract.IBooking;
import caseStudy.service.facility.impl.FacilityServiceImpl;
import caseStudy.service.person.customer.impl.CustomerServiceImpl;
import caseStudy.service.utils.BookingComparator;

import java.io.*;
import java.time.format.DateTimeParseException;
import java.util.*;

public class BookingServiceImpl implements IBooking {
    private static Scanner input=new Scanner(System.in);
    public static final String BOOKING_FILE="D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\caseStudy\\model\\data\\bookingFile.csv";
    static Set<Booking> bookingSet=new TreeSet<>(new BookingComparator());
    static List<Customer> customerList=new ArrayList<>();
    static Map<FuramaFacility,Integer> furamaFacility=new LinkedHashMap<>();
    static {
        customerList=CustomerServiceImpl.readCustomer();
        furamaFacility=FacilityServiceImpl.setListFurama();
        bookingSet=readBookingFile();
    }
    @Override
    public void addBooking() {
        int id=enterID();
        String dayStar = null;
        String dayEnd = null;
        boolean check;
        do {
            try {
                check=false;
                System.out.print("Enter day star:");
                dayStar=input.nextLine();
                System.out.print("Enter day end:");
                dayEnd=input.nextLine();
            }catch (DateTimeParseException e){
                System.out.println("số bạn nhập không đúng định dạng (dd/MM/YYYY)");
                check=true;
            }
        }while (check);
                Customer customer=choiceCustomer();
                FuramaFacility furamaFacility=choiceFacility();
                Booking booking=new Booking(id,dayStar,dayEnd,customer,furamaFacility);
                bookingSet=readBookingFile();
                bookingSet.add(booking);
                writeBooking();
                System.out.println("đang tạo booking");
  //          }catch (DateTimeParseException e){
 //               System.out.println("số bạn nhập không đúng định dạng (dd/MM/YYYY)");
  //              check=true;
  //          }


    }

    @Override
    public void displayBooking() {
        for (Booking booking:bookingSet){
            System.out.println(booking);
        }
    }
    private int enterID(){
        int id=1;
        if (!bookingSet.isEmpty()){
            id=bookingSet.size();
        }
        return id;
    }
    private static Customer choiceCustomer(){
        System.out.println("List customer");
        for (Customer item:customerList){
            System.out.println(item);
        }
        boolean check;
        do {
            check=false;
            System.out.print("Enter id customer:");
            String id=input.nextLine();
            for (Customer customer:customerList){
                if (id.equals(customer.getId())){
                    return customer;
                }else {
                    check=true;
                    System.out.println("you id CUSTOMER is not true");
                }
            }
        }while (check);
        return null;
    }
    private static FuramaFacility choiceFacility(){
        System.out.println("List facility");
        for (Map.Entry<FuramaFacility,Integer> entry:furamaFacility.entrySet()){
            System.out.println(entry.getKey());
        }
        boolean check=false;
        do {
            check=false;
            System.out.print("Enter id facility:");
            String idFacility=input.nextLine();
            for (Map.Entry<FuramaFacility,Integer> entry:furamaFacility.entrySet()){
                if (idFacility.equals(entry.getKey().getIdFacility())){
                    return entry.getKey();
                }else {
                    check=true;
                    System.out.println("you id is not true");
                }
            }
        }while (check);
        return null;
    }
    public static Set<Booking> readBookingFile(){
        Set<Booking> listBooking=new TreeSet<>(new BookingComparator());
        FileReader fileReader;
        try {
            fileReader=new FileReader(BOOKING_FILE);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            String temp[];
            Booking booking;
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(";");
                booking=new Booking(Integer.parseInt(temp[0]),temp[1],temp[2], customerObj(temp[3]), furamaFacilityObj(temp[4]));
                listBooking.add(booking);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listBooking;
    }

    public static void writeBooking(){
        try {
            FileWriter fileWriter=new FileWriter(BOOKING_FILE);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String line=null;
            for (Booking booking:bookingSet){
                line=booking.getIdBooking()+";"+booking.getDayStart()+";"+booking.getDayEnd()+";"+
                        booking.getIdCustomer()+";"+booking.getFacility()+"\n";
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private  static FuramaFacility furamaFacilityObj(String nameObj){
        String facilityObj[] =nameObj.split(",");
        String id=String.valueOf(facilityObj[0].charAt(2));
        if (id.equals("V")){
            FuramaFacility vila = new Villa(facilityObj[0], facilityObj[1], Double.parseDouble(facilityObj[2]), Double.parseDouble(facilityObj[3]),
                    Integer.parseInt(facilityObj[4]), facilityObj[5], facilityObj[6], Double.parseDouble(facilityObj[7]), Integer.parseInt(facilityObj[8]));
            return vila;
        } else if (id.equals("H")) {

            FuramaFacility house = new House(facilityObj[0], facilityObj[1], Double.parseDouble(facilityObj[2]),
                    Double.parseDouble(facilityObj[3]), Integer.parseInt(facilityObj[4]), facilityObj[5], facilityObj[6], Integer.parseInt(facilityObj[7]));
            return house;
        } else  {

            FuramaFacility room = new Room(facilityObj[0], facilityObj[1], Double.parseDouble(facilityObj[2]),
                    Double.parseDouble(facilityObj[3]), Integer.parseInt(facilityObj[4]), facilityObj[5], facilityObj[6]);
            return room;
        }
    }
    private static Customer customerObj(String nameObj){
        String customerObj[]=nameObj.split(",");
        Customer customer=new Customer(customerObj[0],customerObj[1],customerObj[2],customerObj[3],customerObj[4],customerObj[5],
                customerObj[6],customerObj[7] );
        return customer;
    }
}

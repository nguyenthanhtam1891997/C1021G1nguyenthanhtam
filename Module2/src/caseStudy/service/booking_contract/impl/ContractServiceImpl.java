package caseStudy.service.booking_contract.impl;


import caseStudy.model.booking_contract.Booking;
import caseStudy.model.booking_contract.Contract;
import caseStudy.service.booking_contract.IContract;

import java.io.*;
import java.util.*;

public class ContractServiceImpl implements IContract {
    private static Scanner input = new Scanner(System.in);
    private static final String ID_CONTRACT = "CT[0-9]{1,2}";
    private static final String CONTRACT_FILE="D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\caseStudy\\model\\data\\contractFile.csv";
    private static List<Contract> contractList = new ArrayList<>();
    private static Set<Booking> bookingSet = BookingServiceImpl.readBookingFile();
     private static Queue<Booking> bookingQueue=new LinkedList<>();
    static {
        contractList=readContract();
    }

    @Override
    public void addContract() {
        for (Booking booking:bookingSet){
            bookingQueue.add(booking);
        }

        while (!bookingQueue.isEmpty()) {
            Booking bookingObj = bookingQueue.poll();
            String idContract = enterIDContract();
            String booking = "BOOKING ID:" + bookingObj.getIdBooking();
            double moneyDeposit = enterMoney();
            double sumMoney = enterMoney();
            String customer = bookingObj.getIdCustomer().toString();
            Contract contract = new Contract(idContract, booking, moneyDeposit, sumMoney, customer);
            contractList.add(contract);
            writeContract();
            System.out.println("The contract has been updated");
        }
    }

    @Override
    public void displayContract() {
        for (Contract contract:contractList){
            System.out.println(contract);
        }
    }

    @Override
    public void editContract() {
           boolean check=false;
           do {
               System.out.print("Enter id you want to change:");
               String idCheck=input.nextLine();
               if (idCheck.matches(ID_CONTRACT)){
                   for (int i=0;i<contractList.size();i++) {
                       if (contractList.get(i).getIdContract().equals(idCheck)) {
                           System.out.println("Enter money Deposit");
                           double money = enterMoney();
                           System.out.println("Enter sum money");
                           double sumMoney=enterMoney();
                           contractList.get(i).setMoneyDeposit(money);
                           contractList.get(i).setSumMoney(sumMoney);
                       }
                   }
               }else {
                   System.out.println("you enter id is not true ");
                   check=true;
               }
           }while (check);
    }
//    private Booking enterBooking(){
//
//
//   //     bookingID="BOOKING ID:"+String.valueOf(booking.getIdBooking());
//        return booking;
//    }
    private String enterIDContract(){
      String idContract;
      boolean check;
      do {
          check=false;
          System.out.println("Enter id contract");
          idContract=input.nextLine();
          if (!idContract.matches(ID_CONTRACT)){
              check=true;
              System.out.println("id contract is not true");
          }
      }while (check);
      return idContract;
    }
    private double enterMoney(){
        double money = 0;
        boolean check;

        do {
            check=false;
            try {
                System.out.print("Enter money:");
                money=Double.parseDouble(input.nextLine());
                if (money<=0){
                    check=true;
                    System.out.println("money must be bigger zero");
                }
            }catch (NumberFormatException e){
                check=true;
                System.out.println("you enter money is not true");
            }
        }while (check);
        return money;
    }
//    private String enterIDCustomer(){
//
//        String idCustomer= String.valueOf(enterBooking().getIdCustomer());
//        return idCustomer;
//    }
    public static List<Contract> readContract(){
        List<Contract> contractList1=new ArrayList<>();
        FileReader fileReader;
        try {
            fileReader=new FileReader(CONTRACT_FILE);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            String[] temp;
            Contract contract;
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(",");
                contract=new Contract(temp[0],temp[1],Double.parseDouble(temp[2]),Double.parseDouble(temp[3]),temp[4] );
                contractList1.add(contract);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("mang trông");
        }
        return contractList1;
    }
    public static void writeContract(){
        try {
            FileWriter fileWriter=new FileWriter(CONTRACT_FILE);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String line=null;
            for (Contract contract:contractList){
                line=contract.getIdContract()+","+contract.getBooking()+","+
                        contract.getMoneyDeposit()+","+contract.getSumMoney()+","+
                        contract.getCustomer()+"\n";
                bufferedWriter.write(line);
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

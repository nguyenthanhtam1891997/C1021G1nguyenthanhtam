package bai_Tap_Them.bai3.service.cadres_Service_IMPL;

import bai_Tap_Them.bai3.model.Cadres;
import bai_Tap_Them.bai3.service.ICadresService;

import java.util.Scanner;

public class CadresServiceIMPL implements ICadresService {
    private Cadres[] cadresList = new Cadres[20];
    private static Scanner input =new Scanner(System.in);
    private static int count=0;
    @Override
    public void addNewCadres() {
        if (count<cadresList.length){
            System.out.print("Enter code:");
            String code = input.nextLine();
            System.out.print("Enter name:");
            String name =input.nextLine();
            System.out.print("Enter Male:");
            String male = input.nextLine();
            System.out.print("Enter home town:");
            String homeTown = input.nextLine();
            System.out.print("Enter day of birth:");
            String dayOfBirth = input.nextLine();
            System.out.print("Enter transfer:");
            String transfer = input.nextLine();
            System.out.print("Enter level:");
            String level=input.nextLine();
            System.out.print("Enter salary:");
            double salary= input.nextDouble();
            System.out.print("Enter allowance:");
            double allowance= input.nextDouble();
            Cadres cadres=new Cadres(code,name,male,homeTown,dayOfBirth,transfer,level,salary,allowance);
            cadresList[count]=cadres;
            count++;
        }else {
            System.out.println("Full list cadres");
        }
    }

    @Override
    public void getListCadres() {
        for (Cadres cadres:cadresList){
            if (cadres==null){
                break;
            }
            System.out.println(cadres);
        }
    }

    @Override
    public void countFemaleCadres() {
        int countFemale=0;
        for (Cadres cadres : cadresList) {
            if(cadres==null)break;
            if ("NU".equals(cadres.getMale())) {
                countFemale++;
            }
        }
        System.out.println("The female cadres is: "+countFemale);
    }

    @Override
    public void sumMoneyOfCadres() {
        double sumMoney=0;
        for (Cadres cadres:cadresList){
            if (cadres!=null){
                sumMoney+=cadres.getRealTrick();
            }
        }
        System.out.println("Sum monet of Cadres:" +sumMoney);
    }

    @Override
    public void listCadresProIT() {
//      for (Cadres cadres:cadresList){
//          if (cadres.getTransfer().equals("IT")){
//              System.out.println(cadres);
//          }
//      }
        for (Cadres cadres : cadresList) {
            if (cadres==null)break;
            if (cadres.getTransfer().equals("IT")){
                System.out.println(cadres);
            }
        }
    }
}

package bai_Tap_Them.bai3.controler;

import bai_Tap_Them.bai3.service.ICadresService;
import bai_Tap_Them.bai3.service.impl.CadresServiceIMPL;

import java.util.Scanner;

public class CadresController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ICadresService iCadresService=new CadresServiceIMPL();
        do {
            System.out.println("__Cadres Menu__");
            System.out.print("1. Add Cadres");//Print list student
            System.out.print(" 2. Print list Cadres");
            System.out.print(" 3. Count female cadres");
            System.out.print(" 4. Sum cadres of cadres list ");
            System.out.print(" 5. Print list Cadres professional IT");
            System.out.print(" 11. Exit");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    iCadresService.addNewCadres();
                    break;
                case 2:
                    iCadresService.getListCadres();
                    break;
                case 3:
                    iCadresService.countFemaleCadres();
                    break;
                case 4:
                    iCadresService.sumMoneyOfCadres();
                    break;
                case 5:
                    iCadresService.listCadresProIT();
                    break;
                case 11:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}

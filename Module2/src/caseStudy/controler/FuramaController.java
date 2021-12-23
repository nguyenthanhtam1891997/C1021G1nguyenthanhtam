package caseStudy.controler;

import java.util.Scanner;

public class FuramaController {
   static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        displayMaiMenu();
    }
    public  static void displayMaiMenu(){
        do {
            System.out.println("__Display Menu__");
            System.out.println("1. Employee Management ");
            System.out.println("2. Customer Management ");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management ");
            System.out.println("5. Promotion Management ");
            System.out.println("6. Exit");
            System.out.print("Enter you choice:");
            int choice = -1;
            try {
                 choice=Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("You enter not a number enter again");
            }
            switch (choice){
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    displayFacility();
                    break;
                case 4:
                    displayBooking();
                    break;
                case 5:
                    displayPromotion();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }

        }while (true);
    }
    public static void displayEmployee(){
        do {
            System.out.println("__Employee Menu__");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.print("Enter you choice:");
            int choice = -1;
            try {
                choice=Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("You enter not a number enter again");
            }
            switch (choice){
                case 4:
                    displayMaiMenu();
                    break;
            }

        }while (true);
    }
    public static void displayCustomer(){
        do {
            System.out.println("__Customer Menu__");
            System.out.println("1. Display list Customer");
            System.out.println("2. Add new Customer");
            System.out.println("3. Edit Customer");
            System.out.println("4. Return main menu");
            System.out.print("Enter you choice:");
            int choice = -1;
            try {
                choice=Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("You enter not a number enter again");
            }
            switch (choice){
                case 4:
                   displayMaiMenu();
                    break;
            }
        }while (true);
    }
    public static void displayFacility(){
        do {
            System.out.println("__Facility Menu__");
            System.out.println("1. Display list Facility");
            System.out.println("2. Add new Facility");
            System.out.println("3. Edit Facility");
            System.out.println("4. Return main menu");
            System.out.print("Enter you choice:");
            int choice = -1;
            try {
                choice=Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("You enter not a number enter again");
            }
            switch (choice){
                case 4:
                    displayMaiMenu();
                    break;
            }
        }while (true);
    }
    public static void displayBooking(){
        do {
            System.out.println("__Booking Menu__");
            System.out.println("1. Display list Booking");
            System.out.println("2. Add new Booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.print("Enter you choice:");
            int choice = -1;
            try {
                choice=Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("You enter not a number enter again");
            }
            switch (choice){
                case 4:
                    displayMaiMenu();
                    break;
            }
        }while (true);
    }
    public static void displayPromotion(){
        do {
            System.out.println("__Promotion Menu__");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.print("Enter you choice:");
            int choice = -1;
            try {
                choice=Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("You enter not a number enter again");
            }
            switch (choice){
                case 4:
                    displayMaiMenu();
                    break;
            }
        }while (true);
    }
}

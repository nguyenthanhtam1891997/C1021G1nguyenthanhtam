package ss16_IO_Binary_File.bai_tap.controler;

import ss16_IO_Binary_File.bai_tap.model.product_Service_IMPL.ProductServiceIMPL;
import ss16_IO_Binary_File.bai_tap.service.IProductService;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IProductService iProductService=new ProductServiceIMPL();

        do {
            System.out.println("__Product Menu__");
            System.out.println("1. Add Product");//Print list student
            System.out.println("2. Search Product with Name ");
            System.out.println("3. Print list");
            System.out.println("11. Exit");
            System.out.print("Enter you choice: ");
            int choice=-1;
            try {
                 choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
            }

            switch (choice){
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.searchProduct();
                    break;
                case 3:
                    iProductService.printList();
                    break;
                case 11:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}

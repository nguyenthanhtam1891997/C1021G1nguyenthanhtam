package ss11_Map.bai_tap.controler;

import ss11_Map.bai_tap.service.IProductService;
import ss11_Map.bai_tap.service.product_IMPL.ProductServiceArrayIMPL;

import java.util.Scanner;

public class TestMainArrayProduct {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IProductService iProductService=new ProductServiceArrayIMPL();
        do {
            System.out.println("__Product Menu__");
            System.out.println("1. Add Product");//Print list student
            System.out.println("2. Change Information");
            System.out.println("3. Removed Product with ID");
            System.out.println("4. Search Product with Name ");
            System.out.println("5. Sort list product with value");
            System.out.println("6. Print list");
            System.out.println("11. Exit");
            System.out.print("Enter you choice: ");
            int check = Integer.parseInt(input.nextLine());
            switch (check){
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.changeProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.searchProduct();
                    break;
                case 5:
                     iProductService.sortProduct();// vì dùng id là biến static nên sáp xem theo tên cảu sản phẩm
                    break;
                case 6:
                    iProductService.printProducts();
                    break;
                case 11:
                    System.exit(0);
                    break;

            }
        }while (true);
    }
}

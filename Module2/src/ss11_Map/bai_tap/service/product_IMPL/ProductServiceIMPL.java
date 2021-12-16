package ss11_Map.bai_tap.service.product_IMPL;

import ss11_Map.bai_tap.model.Product;
import ss11_Map.bai_tap.service.IProductService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductServiceIMPL implements IProductService {
  private static   List<Product> productList=new ArrayList<>();
  private static Scanner input =new Scanner(System.in);
  private static int id=1;
    @Override
    public void addProduct() {
        System.out.print("Enter name product: ");
        String nameProduct= input.nextLine();
        System.out.print("Enter value money: ");
        double valueMoney=Double.parseDouble(input.nextLine());
        Product product=new Product(id,nameProduct,valueMoney);
        productList.add(product);
        id++;
    }

    @Override
    public void printProducts() {
        for (Product product:productList){
            System.out.println(product+"\t");
        }
    }

    @Override
    public void changeProduct() {
        System.out.print("Enter ID of product you want to change: ");
        int id=Integer.parseInt(input.nextLine());
        int choice;
        do {
            System.out.println("__Change Menu___");
            System.out.println("1. Change Name");
            System.out.println("2. Change Value");
            System.out.println("3. Change Name and Value");
            System.out.print("Choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    ChangeName(id);
                    break;
                case 2:
                    ChangeValue(id);
                    break;
                case 3:
                    ChangeValue(id);
                    ChangeName(id);
                    break;
                default:
                    System.out.println("please choose again ");
            }
        } while (choice > 3);
    }

    @Override
    public void removeProduct() {
        System.out.print("Enter ID of product you want to remove: ");
        int id;
        do {
            id = Integer.parseInt(input.nextLine());
            if (id < productList.size()) {
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getId() == id) {
                        productList.remove(productList.get(i));
                    }
                }
            } else {
                System.out.print("please enter ID again: ");
            }
        } while (id > productList.size());
    }

    @Override
    public void searchProduct() {
        System.out.print("Enter name product:");
        String name=input.nextLine();
        boolean check=false;
        for (Product product:productList){
            if (product.getNameProduct().contains(name)){
                System.out.println(product);
                check=true;
            }
        }
        if (check==false){
            System.out.println("Not found");
        }
    }

    @Override
    public void sortProduct() {
        Collections.sort(productList);
    }

    private void ChangeName(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                System.out.println("Enter name product ");
                String nameProduct = input.nextLine();
                product.setNameProduct(nameProduct);
                break;
            }
        }
    }
    private void ChangeValue(int id){
        for (Product product:productList){
            if (product.getId()==id){
                System.out.println("Enter value ");
                double value = Double.parseDouble(input.nextLine());
                product.setValueMoney(value);
                break;
            }
        }
    }
}

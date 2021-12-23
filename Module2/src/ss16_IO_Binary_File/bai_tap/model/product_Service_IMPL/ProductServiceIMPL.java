package ss16_IO_Binary_File.bai_tap.model.product_Service_IMPL;

import ss16_IO_Binary_File.bai_tap.model.Product;
import ss16_IO_Binary_File.bai_tap.service.IProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceIMPL implements IProductService {
    private static List<Product> productList=new ArrayList<>();
    private static Scanner input=new Scanner(System.in);
    private static final String LINK_PRODUCT="D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\ss16_IO_Binary_File\\bai_tap\\model\\productFile.csv";
    @Override
    public void addProduct() {
        try {
            System.out.print("Enter id: ");
            int id=Integer.parseInt(input.nextLine());
            System.out.print("Enter name:");
            String name=input.nextLine();
            System.out.print("Enter producer:");
            String producer=input.nextLine();
            System.out.print("Enter price:");
            double price=Double.parseDouble(input.nextLine());
            System.out.print("Enter other:");
            String other=input.nextLine();
            Product product=new Product(id,name,producer,price,other);
            productList.add(product);
            writeProduct();
            System.out.println(productList);
        }catch (NumberFormatException e){
            System.out.println("You number is not true");
        }
    }

    @Override
    public void printList() {
        List<Product> productList=readProduct();
        for (Product product:productList){
            System.out.println(product);
        }

    }

    @Override
    public void searchProduct() {
        List<Product> productList=readProduct();
        System.out.print("Enter name product you want to search:");
        String name=input.nextLine();
        boolean check=false;
        for (Product product:productList){
            if (product.getName().contains(name)){
                System.out.println(product);
                check=true;
            }
        }
        if (check=false){
            System.out.println("not fine");
        }
    }

    private static void writeProduct(){
        try {
            FileOutputStream fileStream=new FileOutputStream(LINK_PRODUCT);
            ObjectOutputStream objectStream=new ObjectOutputStream(fileStream);
            objectStream.writeObject(productList);
            objectStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static List<Product> readProduct(){
        List<Product> productList=new ArrayList<>();
        try {
            FileInputStream inputStream=new FileInputStream(LINK_PRODUCT);
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            productList=(List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }
}

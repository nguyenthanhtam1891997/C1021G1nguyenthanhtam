package ss11_Map.bai_tap.model;

public class Product implements Comparable<Product>{
    private int id;
    private String nameProduct;
    private double valueMoney;

//    public Product() {
//    }

    public Product(int id, String nameProduct, double valueMoney) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.valueMoney = valueMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getValueMoney() {
        return valueMoney;
    }

    public void setValueMoney(double valueMoney) {
        this.valueMoney = valueMoney;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", valueMoney=" + valueMoney +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return this.nameProduct.compareTo(o.getNameProduct());



//        if (this.valueMoney-o.getValueMoney()>0){
//            return 1;
//        }else if (this.valueMoney==o.getValueMoney()){
//            return 0;
//        }else {
//            return -1;
//        }
    }
}

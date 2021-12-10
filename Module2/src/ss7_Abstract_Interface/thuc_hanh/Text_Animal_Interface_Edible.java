package ss7_Abstract_Interface.thuc_hanh;

import ss7_Abstract_Interface.thuc_hanh.animal.Animal;
import ss7_Abstract_Interface.thuc_hanh.animal.Chicken;
import ss7_Abstract_Interface.thuc_hanh.animal.Tiger;
import ss7_Abstract_Interface.thuc_hanh.fruit.Apple;
import ss7_Abstract_Interface.thuc_hanh.fruit.Fruit;
import ss7_Abstract_Interface.thuc_hanh.fruit.Orange;

public class Text_Animal_Interface_Edible {
    public static void main(String[] args) {
        Animal[] animals =new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible= (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[]fruits=new Fruit[2];
        fruits[0]=new Apple();
        fruits[1]=new Orange();
        for (Fruit fruit:fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

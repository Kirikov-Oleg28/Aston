import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addFruit(apple3);

        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);

        System.out.println("Короб с яблоками весит: " + appleBox.getWeight());
        System.out.println("Короб с апельсинами весит: " + orangeBox.getWeight());

        System.out.println("Равен ли вес коробок? " + appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.transferFruits(newAppleBox);

        System.out.println("Короб с яблоками после пересыпки: " + appleBox.getWeight());
        System.out.println("Новый короб с яблоками : " + newAppleBox.getWeight());
    }
}
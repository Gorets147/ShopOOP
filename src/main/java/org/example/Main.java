package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product jacketRed = new Product("Красная куртка", 3000.0, 6.5);
        Product jacketGreen = new Product("Зелёная куртка", 2500.0, 5.0);
        ArrayList<Product> jacketsArr = new ArrayList<>();
        jacketsArr.add(jacketRed);
        jacketsArr.add(jacketGreen);

        Product samsung = new Product("Samsung Galaxy s10", 5000.0, 8.2);
        Product apple = new Product("iphone 12", 54000.0, 7.8);
        ArrayList<Product> smartphoneArr = new ArrayList<>();
        smartphoneArr.add(samsung);
        smartphoneArr.add(apple);

        Category jackets = new Category("Куртки", jacketsArr);
        Category smartphones = new Category("Смартфоны", smartphoneArr);



        User userOne = new User("UserOne", "12345678", new ArrayList<>());
        User userTwo = new User("UserTwo", "12345678", new ArrayList<>());


//        System.out.println(jackets);
//        System.out.println(smartphones);

        userOne.addProductInBasket(samsung);

        System.out.println(userOne);
        System.out.println(userTwo);
    }
}
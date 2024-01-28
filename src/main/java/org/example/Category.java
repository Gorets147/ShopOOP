package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder resStrForProd = new StringBuilder();
        for (Product product : products){
            resStrForProd.append(product);
        }
        return  "Категория товара: " + name + "\n\n" +
                "Товары: " + resStrForProd;
    }
}

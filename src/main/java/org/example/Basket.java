package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    ArrayList<Product> buyProduct;

    protected ArrayList<Product> getBuyProduct() {
        return buyProduct;
    }

    protected void setBuyProduct(ArrayList<Product> buyProduct) {
        this.buyProduct = buyProduct;
    }

    public Basket(ArrayList<Product> buyProduct) {
        this.buyProduct = buyProduct;
    }

    public Basket(){
    }

    public void addProductInBasket(Product product){
        buyProduct.add(product);
    }
}

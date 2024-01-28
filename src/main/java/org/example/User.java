package org.example;

import java.util.ArrayList;

public class User extends Basket{

    private String login;

    private String password;

    public User(String login, String password, ArrayList<Product> buyProduct) {
        this.login = login;
        this.password = password;
        super.buyProduct = buyProduct;
    }

    public User(){
    }

    public String getLogin() {
        return login;
    }

    public ArrayList<Product> getPersonalBasket() {
        return buyProduct;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPersonalBasket(ArrayList<Product> buyProduct) {
        this.buyProduct = buyProduct;
    }

    @Override
    public String toString() {
        StringBuilder resStrForProd = new StringBuilder();
        for (Product product : buyProduct){
            resStrForProd.append(product);
        }
        return  "Имя пользователя: " + login + "\n\n" +
                "Товары: " + "\n" + resStrForProd;
    }
}

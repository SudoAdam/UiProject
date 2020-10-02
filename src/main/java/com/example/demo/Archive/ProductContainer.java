package com.example.demo.Archive;

import java.util.ArrayList;

public class ProductContainer {


   private ArrayList<Product> productsList = new ArrayList<>();

    public void addProduct(Product product) {
        productsList.add(product);
    }

    public void removeProduct(Product product){
        productsList.remove(product);
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }
}

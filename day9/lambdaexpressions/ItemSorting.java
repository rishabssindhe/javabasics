package day9.lambdaexpressions;

import java.util.*;

class Product{
    String name;
    int price;
    int quantity;
    public Product(int quantity, int price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }
}
public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> prod=new ArrayList<>();
        prod.add(new Product(2,14000,"Mobile "));
        prod.add(new Product(1,41000,"Laptop "));
        for(Product p:prod){
            System.out.println(p.name+" "+p.price+" "+p.quantity);
        }
        Collections.sort(prod,(a,b)->a.price-b.price);
        for(Product p:prod){
            System.out.println(p.name+" "+p.price+" "+p.quantity);
        }
    }
}

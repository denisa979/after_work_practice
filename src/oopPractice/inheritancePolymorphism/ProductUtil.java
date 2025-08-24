package oopPractice.inheritancePolymorphism;

import java.util.ArrayList;
import java.util.List;

public class ProductUtil{
    public static void printDescription(List<Product> products){
        for(Product product: products)
            System.out.println(product.getDescription());
    }

    public static void main(String[] args){
        Product laptop=new Electronics(3,"Laptop", 599.99,"Dell");

        Product clothes = new Clothing(3, "Pants", 57.90,12, "Cotton");
        List<Product> products=new ArrayList<>();
        products.add(laptop);
        products.add(clothes);
        ProductUtil.printDescription(products);
    }
}

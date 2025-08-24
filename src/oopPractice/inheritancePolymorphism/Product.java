package oopPractice.inheritancePolymorphism;

import static java.lang.String.format;

public abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price ){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public abstract String getDescription();
}
 class Electronics extends Product{
     private String brand;

     public Electronics(int id,String name,double price,String brand){
         super(id,name,price);
         this.brand=brand;
     }

     public String getBrand(){
         return brand;
     }

     @Override
     public String getDescription() {
         return format("Electronics: %s (Brand: %s, Price: $%.2f)", getName(), getBrand(), getPrice());
     }

 }
 class Clothing extends Product{
     private int size;
     private String material;

     public Clothing(int id,String name,double price,int size,String material){
         super(id,name,price);
         this.size=size;
         this.material=material;
     }

     public int getSize(){
         return size;
     }

     public String getMaterial(){
         return material;
     }

     @Override
     public String getDescription(){
         return format("Clothing: %s (Size: %d, Material: %s, Price: $%.2f",getName(),getSize(),getMaterial(),getPrice());
 }
}
/*

How String.format Works
%s expects a String
%d expects an int
%f or %.2f expects a float or double


 E-commerce Product System: Inheritance and Polymorphism
 You are tasked with designing a simplified E-commerce Product System using Java. The system must support different types of products and demonstrate both inheritance and polymorphism.

 Requirements
 Create a base class called Product with the following attributes and methods:

 Attributes: id, name, price

 Methods: getDescription() (returns a string describing the product)

 Create at least two subclasses of Product:

 Example: Electronics (with an additional attribute brand)

 Example: Clothing (with additional attributes size and material)

 Override the getDescription() method in each subclass to include their specific details.

 Create a method that takes a list of Product objects and prints the description of each product. This method should demonstrate polymorphism by calling getDescription() on each product.

 Additional Constraints
 Use appropriate access modifiers.

 Demonstrate the use of constructors in both base and derived classes.

 Do not include the implementation or solution—only the problem statement and requirements.

 Task:
 Design the classes and methods as described above. Do not write the implementation or code solution.
  */
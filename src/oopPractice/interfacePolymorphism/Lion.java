package oopPractice.interfacePolymorphism;

public class Lion implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Lion Roar! ");

    }

    @Override
    public void eat(){
        System.out.println("Lion eat meat");

    }
}

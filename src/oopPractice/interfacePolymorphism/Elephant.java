package oopPractice.interfacePolymorphism;

public class Elephant implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Elephant trumpet!");

    }
    @Override
    public void eat(){
        System.out.println("Elephant eat grass");

    }
}

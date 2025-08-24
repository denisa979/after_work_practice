package oopPractice.interfacePolymorphism;

public class Penguin implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Penguin click-click! ");
        
    }

    @Override
    public void eat(){
        System.out.println("Penguin eat fish! ");

    }
    public void swim(){
        System.out.println("Penguin is swimming! ");
    }
}

package oopPractice.interfacePolymorphism;

public class Zookeeper{
    public void feedAnimal(Animal a){
        a.eat();
    }
    public void stimulateAnimal(Animal a){
        a.makeSound();
    }
}

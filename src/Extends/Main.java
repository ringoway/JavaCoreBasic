package Extends;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        dog.eat();
        dog.sleep();
        dog.bark();
        animal.eat();
        dog.setName("Nikola");
        dog.showName();
    }
}

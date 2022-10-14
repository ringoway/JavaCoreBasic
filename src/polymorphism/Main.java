package polymorphism;

import sun.font.EAttribute;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.meow();
        dog.bark();
        cat.eat();
        dog.eat();
        System.out.println("");

        Eat(dog);
        Eat(cat);
        Eat(animal);


    }
    public static void Eat(Animal animal){
        animal.eat();
    }
}

package Interfaces;

public class Main {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");

        info1.showInfo();
        info2.showInfo(); // эти процедуры нужны для полиморфизма?

        outputInfo(info1);
        outputInfo(info2);

        Animal animal1 = new Animal(2);
        Person person1 = new Person("Rob");
        outputInfo(animal1);
        outputInfo(person1);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}

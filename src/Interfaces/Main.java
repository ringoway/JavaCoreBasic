package Interfaces;

public class Main {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        Info info3 = new Plants(113);

        info1.showInfo();
        info2.showInfo(); // эти процедуры нужны для полиморфизма?

        outputInfo(info1);
        outputInfo(info2);
        outputInfo(info3);

        Animal animal1 = new Animal(2);
        Person person1 = new Person("Rob");
        Plants plants1 = new Plants(213);

        outputInfo(animal1);
        outputInfo(person1);
        outputInfo(plants1);


    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}

package Interfaces;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }


    public void sayHello(){
        System.out.println("I say 'Hello'");
    }

    public void showInfo() {
        System.out.println("Name is "+this.name);
    }
}

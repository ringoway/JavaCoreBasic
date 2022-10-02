package UpcastingAndDowncasting;

import Extends.Dog;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        // Upcasting - Восходящее преобразование - неявное и всегда безопасно
        Animal animal = bird;
        // Downcasting - Нисходящее преобразование
        Bird bird2 = (Bird) animal;
        bird2.fly();

        Animal a = new Animal();
        Bird bird1 = (Bird) a;
        bird1.fly(); // <= ошибка
    }
}

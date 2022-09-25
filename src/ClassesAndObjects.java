public class ClassesAndObjects { // может быть один
    public static void main(String[] args) {
        Person man1 = new Person();

        man1.setNameAndAge("Олег", man1.age); // 1 пункт
        man1.age = 43;
        man1.speak();

        Person man2 = new Person();
        man2.name = "Глеб";
        man2.age = 27;
        man2.speak();

        Person man3 = new Person();
        String s1 = "Никита";
        man3.setNameAndAge(s1, 40);

        man3.speak();
        // если попытаемся в какой-то тип данных вызвать метод с void
        // то ничего не получится, так как void возвращает ничто
        int year1 = man1.calculateYearsToRetirement();
        int year2 = man2.calculateYearsToRetirement();
        int year3 = man3.calculateYearsToRetirement();
        System.out.println("До пенсии "+man1.name+"у"+" "+year1+ " лет");
        System.out.println("До пенсии "+man2.name+"у"+" "+year2+ " лет");
        System.out.println("До пенсии "+ man3.name+"е"+" "+year3+ " лет");


    }
}
class Person { // может быть несколько
    /* У класса могут быть
    1. Данные (поля) - name
    2. Методы (действия) - speak()
     */
    String name;
    int age;

    void speak() {
        // void - это у метода тип возвращаемого значения и возвращает ничто
        // () - параметры
        // return - после исполнение сразу выходит из метода
        // после return нету смысла нечего писать
        // метода должен быть тип возвращаемого значения - void, int, float...
        System.out.println("Меня зовут "+name+" мне "+age+" лет.");
    }
    int calculateYearsToRetirement(){
        int yearsTR = 65-age;
        return yearsTR;
    }

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

}

import java.util.Scanner;

public class This {
    public static void main(String[] args) {

        Human man1 = new Human(); // обьекты создаются по шаблону класса

        man1.setName("Том");
        man1.setAge(12);
        man1.getInfo();

}}
class Human { //этот класс абстрактный
    private String name;
    private int age;

    public void setName(String name){ //userName используется только в этих фигурных скобках
        this.name = name;           // this.name что-то по типу man1.name
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name+" "+age);
    }
}
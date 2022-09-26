public class Constructors {
    public static void main(String[] args) {
        Humans human1 = new Humans("Roe",44);
        human1.sayHello();
    }
}
class Humans {
    private String name;
    private int age;
    public Humans(){
        System.out.println("Имя по умолчанию");
    }
    public Humans(String name){
        this.name = name;
    }

    public Humans(String name, int age){
        this.name = name;
        this.age = age;
    }



    public void setName (String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Hello, i am "+name+", my old " + age+ " year.");
    }

}

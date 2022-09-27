public class Static {
    public static void main(String[] args) {
        Humans1.description = "Nice";
        Humans1.getDescription();
        Humans1 h1 = new Humans1("Bob", 45);
        h1.description = "Bad";
    }
}
class Humans1 {
    private String name;
    private int age;

    public static String description;

    public Humans1(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public static void getDescription(){
        System.out.println(description);
    }
}

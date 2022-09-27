public class Static {
    public static void main(String[] args) {
        Humans1 h1 = new Humans1("Bob", 45);
        Humans1 h2 = new Humans1("Gab", 42);

        h2.howCountPeople();
        h1.howCountPeople();

        h1.description = "Bad";
        Humans1.description = "Nice";
        Humans1.getDescription();
    }
}
class Humans1 {
    private String name;
    private int age;
    private static int countPeople; // эта переменная одна для всех объектов.

    public static String description;

    public Humans1(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void howCountPeople(){
        System.out.println("People: "+countPeople);
    }
    public static void getDescription(){
        System.out.println(description);
    }
}

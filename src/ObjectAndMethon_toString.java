public class ObjectAndMethon_toString {
    public static void main(String[] args) {
        Man man1 = new Man("Rob", 32);
        System.out.println(man1.toString());
    }
}
class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+","+age;
    }
}
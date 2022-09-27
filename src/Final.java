

public class Final {
    public static void main(String[] args) {
        Test.printCONSTANT();
    }
}
class Test {
    public static final int CONSTANT=5;

    public static void printCONSTANT(){
        System.out.println(Test.CONSTANT);
    }

}
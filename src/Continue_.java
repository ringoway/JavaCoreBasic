public class Continue_ {
    public static void main(String[] args) {
        for (int a = 0; a <= 15; a++) {
            if (a % 2 == 0) {
                continue; //этот оператор пропускает цикл, если условие true
            }
            System.out.println("Это нечетное число " + a);
        }
    }
}
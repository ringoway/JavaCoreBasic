import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);

        do { // данный цикл в начале даёт инструкцию, а после проверяет условие.
            System.out.println("Введите число больше или равному 50");
            a = scan.nextInt();
        } while (a<50);
        System.out.println("Вы ввели число больше или равному 50");
    }
}
import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите число от 0 до 2");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        switch (a) {
            case 0 :
                System.out.println("ноль");
                break;
            case 1 :
                System.out.println("один");
                break;
            case 2:
                System.out.println("два");
                break;
            default:
                System.out.println("Вы не ввели число от 0 до 2");
                break;
        }

    }

}

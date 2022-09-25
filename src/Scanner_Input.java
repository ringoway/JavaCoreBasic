import java.util.Scanner;

public class Scanner_Input {
    public static void main(String[] args) {
        System.out.println("Введите что-нибудь");

        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();

        System.out.println("Вы ввели <"+ i+">");
    }
}

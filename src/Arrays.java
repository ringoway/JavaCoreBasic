import java.util.Scanner;

public class Arrays {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи месяц рождения от 1 до 12");
        int a = s.nextInt();
        String [] number = {"Думал ты", "Красивый(ая) ", "Страшный(ая) ", "Умный(ая) ", "Уродливый(ая) ", "Прекрасный(ая) ",
                "Милый(ая) ", "Добрый(ая) ", "Сказочный(ая) ", "Жизнерадостный(ая) ", "Грустный(ая) ", "Весёлый(ая) ",
                "Депрессивный(ая) "};
        System.out.println("Введи день рождения от 1 до 31");
        int b = s.nextInt();
        String [] number1 = {" самый умный?", "Попугай", "Выдра", "Бобр", "Заяц", "Медведь", "Собака", "Кот", "Носорог", "Бегемот",
                "Слон", "Крокодил", "Динозавр", "Крыса", "Мышь", "Болотная тварь", "Колобок", "Лиса", "Волк", "Рыба-клоун",
                "Курица", "Коза", "Осёл", "Баран", "Змея", "Скорпион", "Хомяк", "Тигр", "Лев", "Синий кит", "Кашалот", "Белуга"};

        System.out.println("Вы "+number[a]+number1[b]+".");
    }
}

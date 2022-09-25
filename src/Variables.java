public class Variables {
    public static void main(String[] args) {

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 900000000; // вроде как 2 в 64 степени

        float f = 103.89f; // тоже дробное число но нужна буква f
        double d = 214314.666006; // дробные числа

        boolean bool = 5>0; // либо true или false
        char c = '♥'; // тут символы из UTF-16, можно написать любой 1 символ либо число

        System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+bool+" "+c);

    }
}

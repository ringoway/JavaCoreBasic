public class WrapperClassesPrimitives {
    public static void main(String[] args) {
        int x = 1;

        Integer x2 = new Integer(123);
        Integer.parseInt("123"); // переделывает строку в число

        double d = 12.3;
        Double d2 = 1223.0; // = new Double(123.0);
        double d0 = d2;
        System.out.println(d0);

        // если хотим применить метод к примитиву, то вызываем классы соответственно примитиву
    }
}

public class ExplicitAndImplicit {
    public static void main(String[] args) {
        long l = 123;
        int x = (int) l;
        double z = 4.9;
        int y = (int) z;

        System.out.println(y);

        long l1 = Math.round(z);

        System.out.println(l1);
    }
}

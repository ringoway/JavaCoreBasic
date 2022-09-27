public class String_Builder {
    public static void main(String[] args) {
        /* String x = "Hello"; // этот объект удалится сборщиком мусора.
        // так как оно не используется и никакая переменная не ссылается
        x = x.toUpperCase();
        System.out.println(x);
        x = x.toLowerCase();
        System.out.println(x);

        String str1 = "Hello";
         String str2 = " my";
          String str3 = " friend";
        String allStr = str1+str2+str3;
        allStr = allStr.toLowerCase();
        System.out.println(allStr); */

        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("my ");
        sb.append("friend!");
        System.out.println(sb.toString());

    }
}

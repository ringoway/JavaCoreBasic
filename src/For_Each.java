public class For_Each {
    public static void main(String[] args) {
        String [] strings = new String[6];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "My";
        strings[3] = "Name";
        strings[4] = "is";
        strings[5] = "Mario";

        for (String str: strings) {
            System.out.println(str);
        }

        int [] numbers = {1,2,3};
        int sum = 0;
        for (int x:numbers) {
            sum=sum+x;

        }System.out.println(sum);
    }


}

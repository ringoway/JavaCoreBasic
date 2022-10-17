public class ClassesAndObject_SetAndGet {
    public static void main(String[] args) {
        People person = new People();
        person.setName("Имя");
        person.setAge(12);
        System.out.println("Значение в main от геттеров имени: "+person.getName());
        System.out.println("Значение в main от геттеров возраст: "+person.getAge());
        person.speak(); /* что дают сеттеры и геттеры? Внутри созданного класса мы можем
        к примеру изменить переменную name на login и это никак не повлияет на метод main
        и пользователь не заметит этого, он обращается к этой внутренней переменной
        по этому же классу, но внутр. перем-я может как угодно изменятся */
    }
}
class People {
    private String login;
    private int age;

    public void setName(String userName){ // сеттер
        if (userName.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        } else {
        login = userName;} //
    }
    public String getName(){ // геттер
        return login;
    }
    public void setAge(int userAge){
        if(userAge<0){
            System.out.println("Ты ввел отрицательный возраст");
        } else {
        age = userAge;}
    }
    public int getAge(){
        return age;
    }
    void speak() {
        System.out.println("Привет, меня зовут "+login+", мне "+age+" лет");
    }
}

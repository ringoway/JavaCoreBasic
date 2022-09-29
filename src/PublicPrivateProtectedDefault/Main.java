package PublicPrivateProtectedDefault;

public class Main {
    public int id;
    private int ed;
    protected int ad;

    //public - везде можно пользоваться этим объектом на всем проекте
    //private - в пределах класса Main
    //default - модификатор доступа по умолчанию, доступ только в пределах этого пакета
    //protected - доступны в пределах одного пакета, доступны всем подклассам, даже если эти
    // подклассы вне пакета
    public static void main(String[] args) {

    }
    private void techMeth(){}
}

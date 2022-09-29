package Interfaces;

public class Plants implements Info {
    int number;
    Plants(int number){
        this.number = number;
    }
    public void glow(){
        System.out.println("I am growing");
    }

    @Override
    public void showInfo() {
        System.out.println("Number is "+this.number);
    }
}

package tdd.examples;

public class Exam05 {
    public static void main(String[] args){
        MyBean bean2 = new MyBean(){
            @Override
            public void run() {
                System.out.println("run2!!!");
            }
        };
        bean2.run();
    }
}

abstract class MyBean{
    public abstract void run();
}

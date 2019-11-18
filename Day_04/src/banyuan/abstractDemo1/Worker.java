package banyuan.abstractDemo1;

public class Worker extends  Person {


    @Override
    public void eat() {
        System.out.println("这是worker的eat");
    }

    @Override
    public void sleep() {
        System.out.println("这是worker的sleep");
    }
}

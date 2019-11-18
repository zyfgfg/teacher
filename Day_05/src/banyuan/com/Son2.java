package banyuan.com;
public class Son2 extends  Person implements GongDemo,Son3{

    @Override
    public void work() {
        System.out.println("这是son2实现的方法work");
    }

    @Override
    public void study() {
        System.out.println("这是son2实现的study方法");
    }


    @Override
    public void show() {
        System.out.println("son2 喜欢表演");
    }

    @Override
    public void life() {

    }
}

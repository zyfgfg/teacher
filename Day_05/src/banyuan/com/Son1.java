package banyuan.com;

public class Son1 extends Person implements GongDemo2{


    @Override
    public void work() {
        System.out.println("这是son1实现的方法work");
    }

    @Override
    public void study() {
        System.out.println("这是son1实现的study方法");
    }


    @Override
    public void paoniu() {
        System.out.println("son1喜欢泡妞...");
    }


}

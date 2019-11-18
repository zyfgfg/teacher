package banyuan.finalDemo;

public class Son  {

    private final  String  STR="张三";

    public String getSTR() {
        return STR;
    }

    public final void   show(final int age){ //age

        System.out.println("我是son 方法");
    }
    public void   show(final  FinaleDemo  demo){

        //demo=new FinaleDemo("niha",34);
        demo.setName("asdas");

    }


}

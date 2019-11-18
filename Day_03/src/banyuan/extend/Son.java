package banyuan.extend;

public class Son  extends  Father{



    public Son(){
        super(); //子类的super()默认隐藏
        System.out.println("son...构造方法");
    }


    public String style="真丑"; //你独特的属性

    public   void   study(){
        System.out.println("我在上大学");

    }

    public  void  paoniu(){
        System.out.println("我可以泡妞");
    }

}

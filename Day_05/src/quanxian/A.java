package quanxian;

public class A {

    public  String  name="public";
    String  address="这是默认权限修饰符";
    protected  int  age=34;
    private  String   pwd="密码";



    public void show(){
        System.out.println("protected...."+age);
        System.out.println("默认的..."+address);
    }





}

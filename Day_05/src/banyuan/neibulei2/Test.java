package banyuan.neibulei2;

public class Test {

    public static void main(String[] args) {
        Outer.Inner  out=new Outer().new Inner();
        out.insert();

        Outer.Inner2  out2=new  Outer().new Inner2();
        out2.insert();
    }

}

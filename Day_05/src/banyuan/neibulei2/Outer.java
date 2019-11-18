package banyuan.neibulei2;

public class Outer  {

    public  class Inner extends  DataUpdate{

        @Override
        public void insert() {
            System.out.println("这是inner1");
        }
    }
    public  class  Inner2 extends  DataUpdate2{

        @Override
        public void insert() {
            System.out.println("这是inner2");
        }
    }




}

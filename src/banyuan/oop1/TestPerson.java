package banyuan.oop1;

public class TestPerson {
    public static void main(String[] args) {
        Person  per=new Person();
        per.name="刘国泰";
     System.out.println(per.name+per.age+"--"+per.height+"--"+per.sex);
        per.rap("monkey");
        per.age=-10;
        System.out.println(per.age);





    }
}

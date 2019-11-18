package banyuan.duotaiDemo2;

public class TestDemo {

    public static void main(String[] args) {
        Person  p=new  NorthPerson();

        NorthPerson  n=(NorthPerson) p;
        n.chuiNiu(); //
        System.out.println("---"+p.address);

        NorthPerson  northPerson=new NorthPerson();
        System.out.println(northPerson.address);

        Person  per=northPerson;
        System.out.println(per.address);
        per.eat();




    }

}

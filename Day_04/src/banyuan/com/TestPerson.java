package banyuan.com;

public class TestPerson {

    public static void main(String[] args) {
        Tools.addPerson(new Person("安其拉",23));

        Tools.addPerson(new Person("安其拉",23));

        Tools.showInfo();

        System.out.println("---------");

        ATools.updatePerson("沾上干2","李四");

        Tools.showInfo();


    }
}

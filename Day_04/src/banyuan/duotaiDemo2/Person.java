package banyuan.duotaiDemo2;

public class Person {

    private String name;
    private String  local;
    public  String  address="person下水道";

    public Person(String name, String local) {
        this.name = name;
        this.local = local;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", local='" + local + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void  eat(){
        System.out.println("这是人的吃饭的方式...");
    }



}

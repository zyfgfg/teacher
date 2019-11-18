package banyuan.extend2;

public class Person extends  Object {

    private   String  name;
    private   String  IdCard;
    private   int  age;
    private   int  stuNumber;
    public String  address="仙林大学";




    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
        System.out.println("这是父类的....stuNumber");
    }

    public Person(String name, String idCard, int age) {
        this.name = name;
        IdCard = idCard;
        this.age = age;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", IdCard='" + IdCard + '\'' +
                ", age=" + age +
                '}';
    }

    public  void  eat(){
        System.out.println("吃饭");
    }
    public  void  sleep(){
        System.out.println("躺着...睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package banyuan.com;

public class Student {

    //国际学校
    private  String name;
    private  String  address;
    private  String  country;
    private  String  age;

    public Student(String name, String address, String country, String age) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.age = age;
    }

    public Student(String name, String address, String country) {
        this.name = name;
        this.address = address;
        this.country = country;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

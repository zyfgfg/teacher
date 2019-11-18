package banyuan.zhangyukaoshi;

public class Worker {private int age;
    private String name;
    private double salary;
    public Worker (){}
    public Worker (String name, int age, double salary){
        this.name=name;
        this.age = age;
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
public boolean equals(Worker w){
        if(w.name.length()!=name.length()) {
            return false;}
        if(!w.name.equals(name)){return false;}
        if(w.salary!=salary){return false;}
        if(w.age!=age){return false;}

    return true;}
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
}public void work(){
        System.out.println(name + " work");
    }
    @Override
    public int hashCode(){return name.hashCode();

    }


}

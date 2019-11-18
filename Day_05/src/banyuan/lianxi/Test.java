package banyuan.lianxi;

public class Test {

    public static void main(String[] args) {
        String  name="张三";

        new Tools().getShow(new Person() {
            @Override
            public String getShow() {
                return name;
            }
        });


    }


}

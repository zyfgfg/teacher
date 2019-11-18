package cn;

public class TestCompareStr {

    public static void main(String[] args) {
        //你们是第三方公司   找我要比较字符串的这个功能
        ComperaStr  st=new CompareStrImpl();
        System.out.println(st.equalsStr("你好","稳重"));


    }
}

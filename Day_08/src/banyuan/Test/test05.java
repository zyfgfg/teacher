package banyuan.Test;
/**6.数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果（10分）*/
public class test05 {
    public static void main(String[] args) {
        String []sc=new String[]{"2","2342","21314","235","25","235","2352","2352","sfs","fag"};
        for (int i = 0; i < 5; i++) {String temp=sc[i];
            sc[i]=sc[9-i];
            sc[9-i]=temp;


        }

        for (int i = 0; i <10 ; i++) {
            System.out.println(sc[i]);
        }
    }
}
